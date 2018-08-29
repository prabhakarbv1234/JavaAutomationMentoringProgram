package com.home.task.seven.two;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;

public class ListFilesUtil {
  
	public static ArrayList<DirectoryDetails> listOfFilesAndDirectories = new ArrayList<DirectoryDetails>();
 
    /**
     * List all files from a directory and its subdirectories
     * @param directoryName to be listed
     */
    public void listFilesAndFilesSubDirectories(String directoryName){
        File directory = new File(directoryName);
        //get all the files from a directory
        File[] fList = directory.listFiles();
        for (File file : fList){
            if (file.isFile()){
                System.out.println(file.getAbsolutePath());
                DirectoryDetails theFile = addDir(file);
                listOfFilesAndDirectories.add(theFile);
            } else if (file.isDirectory()){
            	System.out.println(file.getAbsolutePath());
            	DirectoryDetails theDir = addDir(file);
            	listOfFilesAndDirectories.add(theDir);
                listFilesAndFilesSubDirectories(file.getAbsolutePath());
                
            }
        }
    }
    public static DirectoryDetails addDir(File inputfile){
    	
    	DirectoryDetails file = new DirectoryDetails();
    			file.setName(inputfile.getName());
    			file.setSize(inputfile.length());
    			long createdDateinLongFormat = inputfile.lastModified();
    			Date date = new Date(createdDateinLongFormat);
    			file.setCreatedate(date);
    			if(inputfile.isFile()){
    			file.setType("File");}
    			else file.setType("Dir");
    	return file;
    	
    }
    public static void main (String[] args) throws IOException{
        ListFilesUtil listFilesUtil = new ListFilesUtil();
        final String directoryWindows =System.getProperty("user.dir") + "/src/test/resources/ListDirectory";
        listFilesUtil.listFilesAndFilesSubDirectories(directoryWindows);
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + "/src/test/resources//htmlFile.html"));
        bw.write("<html><head><title>Directories</title><style>table, th, td {    border: 1px solid black;    border-collapse: collapse;}</style></head><body>");
        bw.append("<table><tr><th>Name</th><th>Size</th><th>Type</th><th>CreatedDate</th></tr><tr>");
        for(DirectoryDetails d : listOfFilesAndDirectories){
        	bw.append("<td>"+d.getName()+"</td><td>"+ d.getSize()+"</td><td>" +d.getType()+"</td><td>" +d.getCreatedate()+"</td>");
        	bw.append("</tr>");
        	System.out.println(d.getName()+ d.getSize());
        }
       
        bw.append("</table></body></html>");
        		
        bw.close();

    }
}

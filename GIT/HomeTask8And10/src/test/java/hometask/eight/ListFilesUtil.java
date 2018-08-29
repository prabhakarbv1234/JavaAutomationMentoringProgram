package hometask.eight;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class ListFilesUtil {
  
	public static ArrayList<DirectoryDetails> listOfFilesAndDirectories = new ArrayList<DirectoryDetails>();
	private static Logger logger = LogManager.getLogger(ListFilesUtil.class);
   
    public void listFilesAndFilesSubDirectories(String directoryName){
    	logger.info("reading list of File into a directories"+directoryName);
    	File directory=null;
    	try {
         directory = new File(directoryName);        
        File[] fList = directory.listFiles();
        for (File file : fList){
            if (file.isFile()){
            	logger.info(file.getAbsolutePath());
                DirectoryDetails theFile = addDir(file);
                listOfFilesAndDirectories.add(theFile);
            } else if (file.isDirectory()){
            	logger.info("file path-->"+file.getAbsolutePath());
            	DirectoryDetails theDir = addDir(file);
            	listOfFilesAndDirectories.add(theDir);
                listFilesAndFilesSubDirectories(file.getAbsolutePath());
                
            }
        }
    }catch(Exception e) {
    	logger.error(" Either file doesn't exist or error while opening. Due to following execption"+e.getMessage());
    }
    	finally {
    		directory=null;
    	}
    }
    public static DirectoryDetails addDir(File inputfile){
    	logger.info("Added the directories");
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
   
    public static void main(String []args){
    	try {			
			ListFilesUtil listFilesUtil = new ListFilesUtil();
	        final String directoryWindows =System.getProperty("user.dir") + "/src/test/resources/ListDirectory";
	        listFilesUtil.listFilesAndFilesSubDirectories(directoryWindows);
	        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + "/src/test/resources//htmlFile.html"));
	        bw.write("<html><head><title>Directories</title><style>table, th, td {    border: 1px solid black;    border-collapse: collapse;}</style></head><body>");
	        bw.append("<table><tr><th>Name</th><th>Size</th><th>Type</th><th>CreatedDate</th></tr><tr>");
	        for(DirectoryDetails d : listOfFilesAndDirectories){
	        	bw.append("<td>"+d.getName()+"</td><td>"+ d.getSize()+"</td><td>" +d.getType()+"</td><td>" +d.getCreatedate()+"</td>");
	        	bw.append("</tr>");
	        	logger.info("Directory Name-->"+d.getName()+"Directory Size-->"+ d.getSize());
	        }
	       
	        bw.append("</table></body></html>");
	        		
	        bw.close();
		} catch (IOException e) {
			logger.error("The directory is not existing"+e.getMessage());
		}
        

    }
}

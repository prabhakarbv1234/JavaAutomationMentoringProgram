package com.home.task.seven.one;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONReader {
	public static void main(String[] args) throws Exception {
		User user =new User();
		 user = (User) readJon(user);
		 System.out.println("UserId-->"+user.getId());
		createJsonObject(user);
		System.out.println("Sucessfully read json file and convert into pojo");
		System.out.println("Sucessfully created the json file JSONFileData.json");

	}

	private static void createJsonObject(User user) {
		ObjectMapper mapper = new ObjectMapper();
		FileOutputStream fileOutputStream;
		try {
			fileOutputStream = new FileOutputStream("JSONFileData.json");
			mapper.writeValue(fileOutputStream, user);
			fileOutputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static Object readJon(User user) {		
		Object obj;
		try {
			obj = new JSONParser()
					.parse(new FileReader(System.getProperty("user.dir") + "/src/test/resources/JSONFile.txt"));
			JSONObject jo = (JSONObject) obj;
			user.setId(Integer.parseInt(jo.get("userId").toString()));
			user.setId(Integer.parseInt(jo.get("id").toString()));
			user.setTitle(jo.get("title").toString());
			user.setBody(jo.get("body").toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return user;

	}
}

package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileReadWriteDemo {

	public static void main(String[] args) throws IOException {
		
	
		
		String path = System.getProperty("user.dir");
		File files = new File(path);
		
		for(File f:files.listFiles())
		{
			System.out.println(f);
			System.out.println(f.isDirectory());
		}
		
		File dir = new File("/Users/Shalini/Documents/data.numbers");
		//dir.mkdir();
		
		File file = new File(dir, "test.txt");
		//file.createNewFile();
	
		System.out.println("deleting");
		System.out.println(dir.delete());
		
		/*
		 * InputStream/OutputStream => bytes (media) hello
		 * Reader/writer => textual files
		 */
//		
////		FileWriter writer = new FileWriter("demo.txt", true);
////		writer.write("Hello now\n");
////		writer.write("Welcome!!!\n");
////		writer.close();
//		
//		FileReader reader = new FileReader("demo.txt");
//		BufferedReader bufferedReader = new BufferedReader(reader);
//		String line = "";
//		while( (line = bufferedReader.readLine() ) != null)
//		{
//			if(line.startsWith("Hello"))
//				System.out.println(line);
//		}
//		
//		bufferedReader.close();
//		reader.close();
//		
	}
}

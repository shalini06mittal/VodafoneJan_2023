package com.spring.web.restapi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController // @Controller + @ResponseBody
@RequestMapping("/rest")
public class HelloRestController {


	@GetMapping
	public String getData()
	{
		return "GET CALLED";
	}
	// path parameters => mandatory
	//http://localhost:8081/rest/689979/comment/shalini
	@GetMapping("/{id}/comment/{commentid}")
	public String getPathParameter(@PathVariable int id,
			@PathVariable("commentid") String cid)
	{
		return "Parameter value is "+id+" comment id = "+cid;
	}

	// path parameters
	// http://localhost:8081/rest/query?gst=true => tax
	// http://localhost:8081/rest/query?country=USA&gst=true
	// http://localhost:8081/rest/query?country=USA
	@GetMapping("/query")
	public String getQueryParameter(@RequestParam(required = false) boolean gst,
			@RequestParam(required = false, defaultValue = "India") String country)
	{
		return "GST value is "+gst+" and country is "+country;
	}
	// path parameters
	// http://localhost:8081/rest/matrix/cars;year=2010
	@GetMapping("/matrix/{data}")///{data}")
	public String getMatrixParameter(
			@PathVariable String data,
			@MatrixVariable() int year)
	{
		return "Year value is "+year;
	}
	// http://localhost:8081/rest/matrixall/cars;pages=2010
	@GetMapping("/matrixall/{data}")///{data}")
	public String getAllMatrixParameter(
			@PathVariable String data,
			@MatrixVariable() Map<String, String> map)
	{
		StringBuilder builder = new StringBuilder();
		map.forEach((k,v)->{
			System.out.println(k);
			System.out.println(v);
			builder.append(k+" : "+v+" ");
		});
		return "Map data is " + builder;
	}
	@PostMapping
	public String postData()
	{
		return "POST CALLED";
	}
	@PutMapping
	public String putData()
	{
		return "PUT CALLED";
	}
	@DeleteMapping
	public String deleteData()
	{
		return "DELETE CALLED";
	}

	@PostMapping(path="/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public String fileUpload(@RequestParam MultipartFile file)
	{
		String result = "File uploaded successfully";
		
		File convertFile = new File(file.getOriginalFilename());
		FileOutputStream outFile = null;
		try {
			convertFile.createNewFile();
			
			outFile = new FileOutputStream(convertFile);
			
			outFile.write(file.getBytes());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = e.getMessage();
		}
		finally {
			if(outFile != null)
				try {
					outFile.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return result;
		
	}
	

}

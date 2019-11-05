package com.project.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UploadController {
	
	
	
	@Value("${multipart.location}")
	private String location;
	
	@RequestMapping(value="/Upload",method=RequestMethod.POST,
			produces=MediaType.IMAGE_GIF_VALUE)
	public String Upload(@RequestPart("file")MultipartFile file,
			             @RequestParam("Start") int start,
			             @RequestParam("end")int end,
			             @RequestParam("speed")int speed,	
			             @RequestParam ("repeat") boolean repeat )
	{
		return location;

}
}
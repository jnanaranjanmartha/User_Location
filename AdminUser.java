package com.example.UserLocation;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AdminUser {
	
	@GetMapping("/ReaderUser")
	
	public List<ReaderUser> getDataUsers(){
		return Arrays.asList(
				new ReaderUser("Bhubaneswar", 20.2961, 85.8245),
				new ReaderUser("Cuttack", 20.4625, 85.8830),
				new ReaderUser("Puri", 19.8135f, 85.8312f)
				);
		
	}
	@PostMapping 
	public String CreateData(@RequestBody ReaderUser User) {
		return "created";
		
	}
	
	@PutMapping 
	public String UpdateData(@RequestBody ReaderUser User) {
		return "Updated";
		
	}
	
	
	

}

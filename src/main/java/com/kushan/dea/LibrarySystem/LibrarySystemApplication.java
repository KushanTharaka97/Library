package com.kushan.dea.LibrarySystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class LibrarySystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibrarySystemApplication.class, args);

		System.out.println("Worked");
		
	}

	@RequestMapping(value = "/")
	public String load() {
	   return "developing in progress...";
	}

	@RequestMapping(value = "/lendingbooks")
	public String lendingbooks() {
	   return "Hello World";
	}

	@RequestMapping(value = "/handover")
	public String handover() {
	   return "Hello World";
	}
	
	@RequestMapping(value = "/addnewstudent")
	public String addnewstudent() {
	   return "Hello World";
	}

	@RequestMapping(value = "/addnewstaff")
	public String addnewstaff() {
	   return "Hello World";
	}


	@RequestMapping(value = "/error")
	public String hello() {
	   return "Hello World";
	}
	

}

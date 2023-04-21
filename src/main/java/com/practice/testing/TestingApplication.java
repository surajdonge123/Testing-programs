package com.practice.testing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
         public class TestingApplication {
	public static void main(String[] args) {
		SpringApplication.run(TestingApplication.class, args);
		System.out.println("Hellow world");
	}

<<<<<<< Updated upstream
 public String stashmethod() {
	 
	 return "hi hello";
	 
 }
 
 public int id() {
	 return 1;
 }
		
	
=======
	public String stashmethod() {
		return "hi hello";
	}

	public String Stashmethod2() {
		return "Stash method is used for practice";
	}
>>>>>>> Stashed changes
}

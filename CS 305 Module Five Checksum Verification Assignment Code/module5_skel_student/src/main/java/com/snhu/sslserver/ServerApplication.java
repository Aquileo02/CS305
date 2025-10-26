package com.snhu.sslserver;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

}

@RestController
class ServerController{
//FIXME:  Add hash function to return the checksum value for the data string that should contain your name.    
    @RequestMapping("/hash")
    public String myHash() throws NoSuchAlgorithmException {
    	String data = "Hello Alex Zelaya!";
    	//create MessageDigest instance for SHA-256
    	MessageDigest md = MessageDigest.getInstance("SHA-256");
    	//generate hash
    	byte[] hashBytes = md.digest(data.getBytes());
    	//convert hash bytes to hexadecimal string
    	StringBuilder hexString = new StringBuilder();
    	for (byte b : hashBytes) {
    		hexString.append(String.format("%02x", b));
    	}
    
    
    	
        return "<p>data: " + data + "</p>" +
        	   "<p>algorithm: SHA-256</p>" + 
        	   "<p>checksum: " + hexString.toString() + "</p>";
    }
    
}

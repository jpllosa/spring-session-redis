package com.blogspot.jpllosa.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpSession;

import com.blogspot.jpllosa.model.UserData;

@RestController
public class HttpSessionController {

	@PostMapping("/save-to-http-session")
	public HttpEntity<String> saveToHttpSession(@RequestBody UserData userData, HttpSession httpSession) {
		httpSession.setAttribute("userData", userData)		;
		return new ResponseEntity<>("", HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/get-from-http-session")
	public HttpEntity<UserData> getFromHttpSession(HttpSession httpSession) {
		return new ResponseEntity<>((UserData) httpSession.getAttribute("userData"), HttpStatus.OK);
	}
}

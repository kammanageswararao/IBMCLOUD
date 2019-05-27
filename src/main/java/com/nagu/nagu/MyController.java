package com.nagu.nagu;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitterReturnValueHandler;

@RestController
@RequestMapping("/")
public class MyController {

	@GetMapping("/ping")
	public String getPing() {
		return "PING Success";
	}

	@GetMapping("/sucess")
	public String getSucess() {
		return "Success message";
	}

	@GetMapping("/values")
	public String getArrayListvalues() {
		ArrayList<String> Arlist = new ArrayList<String>();
		Arlist.add("kamma");
		Arlist.add("Nageswararao");
		Arlist.add("Nagesh");
		Arlist.add("king");
		Arlist.add("vinoth");
		return "Success values";
		
		
	}

}

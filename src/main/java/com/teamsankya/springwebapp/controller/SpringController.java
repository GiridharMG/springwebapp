package com.teamsankya.springwebapp.controller;

import java.io.IOException;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SpringController {
	@RequestMapping(path="/index", method=RequestMethod.GET)
	public String index(ModelMap map) {
		map.addAttribute("message", "Hello World");
		return "index";
	}
}
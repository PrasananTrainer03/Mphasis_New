package com.java.spr.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/login")
	public ModelAndView check(HttpServletRequest req) {
		String user=req.getParameter("userName");
		String pwd = req.getParameter("passWord");
		if (user.equals("Lalitha") && pwd.equals("Asritha")) {
			return new ModelAndView("menu");
		} else {
			return new ModelAndView("login","message","invalid credentials");
		}
	}
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("login");
	}
}

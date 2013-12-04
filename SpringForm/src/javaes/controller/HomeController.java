package javaes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController
{
	/**
	 * Chama página inicial
	 * */
	@RequestMapping("home")
	public String index()
	{
		return "home/index";
	}
}

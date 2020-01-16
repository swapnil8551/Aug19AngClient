package com.app.controller;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.dao.IBookDao;


@RestController
@RequestMapping("/hi")
public class HomeController {
	
	@Autowired // byType
	private IBookDao Bdao;
	@Autowired // byType
	private SessionFactory session;
	
	public HomeController() {
		System.out.println("home controller");
	}
	@GetMapping
	public  String showHomePage()
	{
		
		System.out.println("in show home page");
		return Bdao.getBooks();
	}
}

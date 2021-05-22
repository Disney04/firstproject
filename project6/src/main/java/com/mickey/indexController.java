package com.mickey;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class indexController {
	
	
	
	@Autowired
	private repository22 jpa22;
	
	public static String username2;
	
	public static accountInfo account02;
	
	
	
	@GetMapping("/index")
	public  String index()
	{
		return "index";
	}

	@GetMapping("/login")
	public  String login(@RequestParam("username") String username,@RequestParam("password2") String password)
	{
			List<accountInfo> list1=jpa22.findall();
			
			
			System.out.println(list1);
			accountInfo account = jpa22.findusername(username);
			account02 = account;
			username2 = username;
		if(!list1.contains(account))
		{
			System.out.println(account);
			
			return "sigh";
		}else if(account.getPassword().equals(password)){
			return "logged";
		}else
		{
			return "sigh";
		}
		
	}
	
	
	
	
	@RequestMapping("/sigh")
	public String sighup()
	{
		return "sigh";
	}
	
	
	@PostMapping("/add")
	public  String add(@RequestParam("username") String username
			,@RequestParam("password") String password,
			@RequestParam("birthday") String birthday,
			@RequestParam("address") String address,
			@RequestParam("email") String email,
			@RequestParam("phone") String phone,
			accountInfo account)
	{
		
		account.setUsername(username);
		account.setPassword(password);
		account.setBirthday(birthday);
		account.setAddress(address);
		account.setEmail(email);
		account.setPhone(phone);
		jpa22.save(account);
		
		username2 = username;
		account02 = account;
		System.out.println(account02+"DFsfsf");
		
		
		return "check";
	}
	@GetMapping("/sighed")
	public String sighed(Model model)
	{
		accountInfo account=jpa22.findusername(username2);
		List<accountInfo> list2 = new ArrayList();
		list2.add(account);		
		
		System.out.println(account);
		
		
		
		model.addAttribute("account",list2);
		
		return "sighed";
	}
	@RequestMapping("/check")
	public String check() {
	
	return "check";	
	}
	
	
	@RequestMapping("/ask")
	public String ask(@RequestParam String ask2)
	{
		if(ask2.equals("yes"))
		{
			return "link";
		}else
		{
			return "sigh";
		}
	}
	
	@RequestMapping("/link")
	public String link()
	{
		return "link";
	}
	

	
	

	

	
	  

}

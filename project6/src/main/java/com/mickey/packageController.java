package com.mickey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class packageController {

	public static packege packege22;
	
	@Autowired
	private jpaRepository22 jpa2200;
	private int airticket;
	
	@RequestMapping("/engyt")
	public String engyt(@RequestParam int pplcount,
			@RequestParam String airline,
			@RequestParam Integer days,
			packege packege
					)
	{
		
		
		packege.setUsername(indexController.username2);
		packege.setNumberppl(pplcount);
		packege.setAirline(airline);
		packege.setDays(days);
		
		if(airline.equals("china"))
		{
			airticket=7000;
		}else
		{
			airticket=10000;
		}
		int cost =pplcount*days*10000+airticket;
		
		
		
		packege packege2 =jpa2200.getmoney(indexController.username2);
		if(!(packege2 == null))
		{
			int increase =packege2.getMoney();
			packege.setTotal(increase+cost);
			
			packege22= packege;
		}else
		{
			System.out.println("skip");
		}
			packege.setMoney(cost);
			accountInfo account2 = indexController.account02;
			account2.getSet1().add(packege);
			packege.setAccountInfo(account2);
			jpa2200.save(packege);
		return "checked2";
		
		
		
		
	}
	@RequestMapping("/japan")
	public String japan(@RequestParam int pplcount,
			@RequestParam String airline,
			@RequestParam Integer days,
			packege packege)
	{
		packege.setUsername(indexController.username2);
		packege.setNumberppl(pplcount);
		packege.setAirline(airline);
		packege.setDays(days);
		if(airline.equals("china"))
		{
			airticket=7000;
		}else
		{
			airticket=10000;
		}
		packege.setMoney(pplcount*days*10000+airticket);
		accountInfo account2 = indexController.account02;
		account2.getSet1().add(packege);
		packege.setAccountInfo(account2);
		jpa2200.save(packege);
		packege22=packege;
		return "checked2";
	}
	@RequestMapping("/swiss")
	public String swiss(@RequestParam int pplcount,
			@RequestParam String airline,
			@RequestParam Integer days,
			packege packege)
	{
		packege.setUsername(indexController.username2);
		packege.setNumberppl(pplcount);
		packege.setAirline(airline);
		packege.setDays(days);
		if(airline.equals("china"))
		{
			airticket=7000;
		}else
		{
			airticket=10000;
		}
		packege.setMoney(pplcount*days*10000+airticket);
		accountInfo account2 = indexController.account02;
		account2.getSet1().add(packege);
		packege.setAccountInfo(account2);
		jpa2200.save(packege);
		packege22=packege;
		return "checked2";
	}
	@RequestMapping("/russia")
	public String russia(@RequestParam int pplcount,
			@RequestParam String airline,
			@RequestParam Integer days,
			packege packege)
	{
		packege.setUsername(indexController.username2);
		packege.setNumberppl(pplcount);
		packege.setAirline(airline);
		packege.setDays(days);
		if(airline.equals("china"))
		{
			airticket=7000;
		}else
		{
			airticket=10000;
		}
		packege.setMoney(pplcount*days*10000+airticket);
		accountInfo account2 = indexController.account02;
		account2.getSet1().add(packege);
		packege.setAccountInfo(account2);
		jpa2200.save(packege);
		packege22=packege;
		return "checked2";
	}
	@RequestMapping("/sydney")
	public String sydney(@RequestParam int pplcount,
			@RequestParam String airline,
			@RequestParam Integer days,
			packege packege)
	{
		packege.setUsername(indexController.username2);
		packege.setNumberppl(pplcount);
		packege.setAirline(airline);
		packege.setDays(days);
		if(airline.equals("china"))
		{
			airticket=7000;
		}else
		{
			airticket=10000;
		}
		packege.setMoney(pplcount*days*10000+airticket);
		accountInfo account2 = indexController.account02;
		account2.getSet1().add(packege);
		packege.setAccountInfo(account2);
		jpa2200.save(packege);
		packege22=packege;
		return "checked2";
	}
	@RequestMapping("/washington")
	public String washington(@RequestParam int pplcount,
			@RequestParam String airline,
			@RequestParam Integer days,
			packege packege)
	{
		packege.setUsername(indexController.username2);
		packege.setNumberppl(pplcount);
		packege.setAirline(airline);
		packege.setDays(days);
		if(airline.equals("china"))
		{
			airticket=7000;
		}else
		{
			airticket=10000;
		}
		packege.setMoney(pplcount*days*10000+airticket);
		accountInfo account2 = indexController.account02;
		account2.getSet1().add(packege);
		packege.setAccountInfo(account2);
		jpa2200.save(packege);
		packege22=packege;
		return "checked2";
	}
}

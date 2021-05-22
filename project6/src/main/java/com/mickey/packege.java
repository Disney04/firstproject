package com.mickey;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="packege")
public class packege {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	@Column(name="username")
	private String username;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}



	@Column(name="numberppl")
	private Integer numberppl;
	@Column(name="airline")
	private String airline;
	@Column(name="days")
	private Integer days;
	@Column(name="money")
	private int money;
	
	@Column(name="totalbuy")
	private int total;
	
	
	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}



	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="account_packege")
	private accountInfo accountInfo;

	public accountInfo getAccountInfo() {
		return accountInfo;
	}

	public void setAccountInfo(accountInfo accountInfo) {
		this.accountInfo = accountInfo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumberppl() {
		return numberppl;
	}

	public void setNumberppl(Integer numberppl) {
		this.numberppl = numberppl;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	@Override
	public String toString() {
		return "packege [id=" + id + ", numberppl=" + numberppl + ", airline=" + airline + ", days=" + days + ", money="
				+ money + ", accountInfo=" + accountInfo + "]";
	}

	
	

	
}

package com.mickey;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="accountInfo")
public class accountInfo {

	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	@Column(name="birthday")
	private String birthday;
	@Column(name="address")
	private String address;
	@Column(name="email")
	private String email;
	@Column(name="phone")
	private String phone;
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy="accountInfo")
	private Set<packege> set1 = new HashSet(); 
	
	
	public Set<packege> getSet1() {
		return set1;
	}
	public void setSet1(Set<packege> set1) {
		this.set1 = set1;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "accountInfo [id=" + id + ", username=" + username + ", password=" + password + ", birthday=" + birthday
				+ ", address=" + address + ", email=" + email + ", phone=" + phone + "]";
	}
}

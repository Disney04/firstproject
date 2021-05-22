package com.mickey;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface repository22 extends JpaRepository<accountInfo, Integer>{
	@Query(value="select * from account_info where username = ?",nativeQuery=true)
	 public accountInfo findusername(String username);
	
	
	@Query(value="select * from account_info",nativeQuery=true)
		public List<accountInfo> findall();
		
		
		
		
	
		
		
	
//		@Query(value="select * from account_info where username = ?",nativeQuery=true)
//	public accountInfo findname(String username);
}

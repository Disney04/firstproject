package com.mickey;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface jpaRepository22 extends JpaRepository<packege,Integer>{
	
	
		@Query(value="select * from packege",nativeQuery=true)
		public List<packege> findall();
		
		@Query(value="select * from packege where username = ?",nativeQuery=true)
		public packege getmoney(String username);
		
		

}

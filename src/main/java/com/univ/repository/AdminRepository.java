package com.univ.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.univ.bean.Admin;



public interface AdminRepository  extends JpaRepository<Admin, Integer> {
	@Query("select a from Admin a where a.unm=?1 AND a.pw=?2")
	public Admin getLogin(String unm, String pw);

}

package com.yurialves.workshopjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yurialves.workshopjpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
	

}

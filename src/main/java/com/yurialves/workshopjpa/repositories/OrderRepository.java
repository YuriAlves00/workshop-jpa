package com.yurialves.workshopjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yurialves.workshopjpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	
	

}

package com.yurialves.workshopjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yurialves.workshopjpa.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	
	

}

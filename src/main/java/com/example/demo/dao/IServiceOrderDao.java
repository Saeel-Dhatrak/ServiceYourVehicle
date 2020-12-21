package com.example.demo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pojo.ServiceOrder;

public interface IServiceOrderDao extends JpaRepository<ServiceOrder, Integer> {
	
	Optional<ServiceOrder> findByOrderId(int id);
}


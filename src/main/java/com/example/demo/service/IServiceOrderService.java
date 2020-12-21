package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.pojo.ServiceOrder;

public interface IServiceOrderService {
	
	List<ServiceOrder> listAllOrders();
	Optional<ServiceOrder> findOrderDetails(int id);
}

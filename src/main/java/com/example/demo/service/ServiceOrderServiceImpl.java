package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IServiceOrderDao;
import com.example.demo.pojo.ServiceOrder;

@Service
@Transactional
public class ServiceOrderServiceImpl implements IServiceOrderService {
	
	@Autowired
	private IServiceOrderDao orderDao;

	@Override
	public List<ServiceOrder> listAllOrders() {
		return orderDao.findAll();
	}

	@Override
	public Optional<ServiceOrder> findOrderDetails(int id) {
		return orderDao.findById(id);
	}

}

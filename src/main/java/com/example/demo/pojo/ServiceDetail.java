/*package com.example.demo.pojo;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ServiceDetail")
public class ServiceDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="detail_id")
	private int detailId;
	
	@OneToMany(mappedBy="detail_id")
	@Column(name="order_id")
	//@JoinColumn(name="order_id")
	private ServiceOrder orderId;
	
	@Column(name="billing_date")
	private LocalDate billingDate;
	
	private int cost;
	
	private String status;
	
	
	
	public ServiceDetail() {
		System.out.println("In the Constructor "+getClass().getName());
	}



	public int getDetailId() {
		return detailId;
	}



	public void setDetailId(int detailId) {
		this.detailId = detailId;
	}



	public ServiceOrder getOrderId() {
		return orderId;
	}



	public void setOrderId(ServiceOrder orderId) {
		this.orderId = orderId;
	}



	public LocalDate getBillingDate() {
		return billingDate;
	}



	public void setBillingDate(LocalDate billingDate) {
		this.billingDate = billingDate;
	}



	public int getCost() {
		return cost;
	}



	public void setCost(int cost) {
		this.cost = cost;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	@Override
	public String toString() {
		return "ServiceDetail [detailId=" + detailId + ", orderId=" + orderId + ", billingDate=" + billingDate
				+ ", cost=" + cost + ", status=" + status + "]";
	}

		
	

}*/

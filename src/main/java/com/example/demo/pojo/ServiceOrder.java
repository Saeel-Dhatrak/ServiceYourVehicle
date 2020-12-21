package com.example.demo.pojo;

import java.time.LocalDate;
import java.util.List;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="ServiceOrder")
public class ServiceOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="order_id")
	private int orderId;	
	
	//@Column(name="customer_id")
	@ManyToOne //@JoinColumn not required as we are not changing column name
	@JoinColumn(name="customer_id")
	private Customer customerId;
	
	//@Column(name="vehicle_id")
	@ManyToOne
	@JoinColumn(name="vehicle_id")
	private Vehicle vehicleId;
	
	//@Column(name="staff_id")
	@OneToOne
	@JoinColumn(name="staff_id")
	private Staff staffId;
	

	@OneToOne
	//@Column(name="service_id")
	@JoinColumn(name="service_id")
	private ServicingType serviceId;
	
	@ManyToMany
	@Column(name="spare_id")
	private List<SparePart> spareId;
	
	@Column(name="booking_date")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate bookingDate;
	
	@Column(length=500,name="problem_description")
	private String problemDescription;
	
	/*
	@ManyToOne
	@JoinColumn(name="order_id")
	private List<ServiceDetail> detailId;
	*/
	
	public ServiceOrder() {
		System.out.println("In the Constructor "+getClass().getName());
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}

	public Vehicle getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Vehicle vehicleId) {
		this.vehicleId = vehicleId;
	}

	public Staff getStaffId() {
		return staffId;
	}

	public void setStaffId(Staff staffId) {
		this.staffId = staffId;
	}

	public ServicingType getServiceId() {
		return serviceId;
	}

	public void setServiceId(ServicingType serviceId) {
		this.serviceId = serviceId;
	}

	public List<SparePart> getSpareId() {
		return spareId;
	}

	public void setSpareId(List<SparePart> spareId) {
		this.spareId = spareId;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getProblemDescription() {
		return problemDescription;
	}

	public void setProblemDescription(String problemDescription) {
		this.problemDescription = problemDescription;
	}

	/*public List<ServiceDetail> getDetailId() {
		return detailId;
	}

	public void setDetailId(List<ServiceDetail> detailId) {
		this.detailId = detailId;
	}*/

	@Override
	public String toString() {
		return "ServiceOrder [orderId=" + orderId + ", customerId=" + customerId + ", vehicleId=" + vehicleId
				+ ", staffId=" + staffId + ", serviceId=" + serviceId + ", spareId=" + spareId + ", bookingDate="
				+ bookingDate + ", problemDescription=" + problemDescription + "]";
						//+ "detailId=" + detailId + "]";
	}

	

}

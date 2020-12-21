package com.example.demo.pojo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="SparePart")
public class SparePart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="spare_id")
	private int spareId;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="part_name")
	private String partName;
	
	private int price;
	
	private String warranty;
	
	@ManyToMany(mappedBy="spareId")
	private List<ServiceOrder> orderId;
	
	public SparePart() {
		System.out.println("In the Constructor "+getClass().getName());
	}

	public int getSpareId() {
		return spareId;
	}

	public void setSpareId(int spareId) {
		this.spareId = spareId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	@Override
	public String toString() {
		return "SparePart [spareId=" + spareId + ", companyName=" + companyName + ", partName=" + partName + ", price="
				+ price + ", warranty=" + warranty + "]";
	}

	
	
	
	
	
}

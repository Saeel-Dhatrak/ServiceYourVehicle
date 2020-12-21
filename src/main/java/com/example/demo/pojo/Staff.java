package com.example.demo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Staff")
public class Staff {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="staff_id")
		private int staffId;
		private String username;
		private String password;
		private String name;
		@Column(name="phone_number")
		private String phoneNumber;
		
		@OneToOne(mappedBy="staffId")
		private ServiceOrder orderId;
		
		public Staff() {
			System.out.println("In the Constructor "+getClass().getName());
		}


		public int getStaffId() {
			return staffId;
		}


		public void setStaffId(int staffId) {
			this.staffId = staffId;
		}


		public String getUsername() {
			return username;
		}


		public void setUsername(String username) {
			this.username = username;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getPhoneNumber() {
			return phoneNumber;
		}


		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}


		@Override
		public String toString() {
			return "Staff [staffId=" + staffId + ", username=" + username + ", password=" + password + ", name=" + name
					+ ", phoneNumber=" + phoneNumber + "]";
		}

		
		
		
		
		
		
}

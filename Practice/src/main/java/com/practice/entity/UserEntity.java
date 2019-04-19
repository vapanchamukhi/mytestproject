package com.practice.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="user_det")
@EntityListeners(AuditingEntityListener.class)
public class UserEntity {
	/*
	 * @Id to indicate primary key 
	 * 
	 * @GeneratedValue annotation is used to define the primary key generation strategy. 
	 * In the above case, we have declared the primary key to be an Auto Increment field.
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long user_id;
	
	@NotBlank
	private String userName;
	
	@NotBlank
	private String first_name;
	
	@NotBlank
	private String last_name;
	
	@Email
	private String email;
	
	private String contactNumber;
	
	/*
	 * @Temporal annotation is used with java.util.Date and java.util.Calendar classes. 
	 * It converts the date and time values from Java Object to compatible database type and vice versa.
	 * 
	 * @CreatedDate is used to automatically add Created Date
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createdDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date modifiedDate;

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Override
	public String toString() {
		return "UserEntity [user_id=" + user_id + ", userName=" + userName + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", createdDate=" + createdDate + ", modifiedDate=" + modifiedDate + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	
}

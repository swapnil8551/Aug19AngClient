package com.app.pojos;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "payments")
public class Payments {
	
	
	@Id
	@GeneratedValue
	Integer id;
	float amount;
	String type;
	Time transaction_time;
	Date nextpayment_duedate;
	int userid;
	
	public Payments() {
		// TODO Auto-generated constructor stub
	}

	public Payments(Integer id, float amount, String type, Time transaction_time, Date nextpayment_duedate) {
		super();
		this.id = id;
		this.amount = amount;
		this.type = type;
		this.transaction_time = transaction_time;
		this.nextpayment_duedate = nextpayment_duedate;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Time getTransaction_time() {
		return transaction_time;
	}

	public void setTransaction_time(Time transaction_time) {
		this.transaction_time = transaction_time;
	}

	public Date getNextpayment_duedate() {
		return nextpayment_duedate;
	}

	public void setNextpayment_duedate(Date nextpayment_duedate) {
		this.nextpayment_duedate = nextpayment_duedate;
	}

	
	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "payments [id=" + id + ", amount=" + amount + ", type=" + type + ", transaction_time=" + transaction_time
				+ ", nextpayment_duedate=" + nextpayment_duedate + ", userid=" + userid + "]";
	}
	
	

}

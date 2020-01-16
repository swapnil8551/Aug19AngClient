package com.example.pojos;
import javax.persistence.*;

@Entity
@Table(name = "copies")
public class Copies {
	
	@Id
	@GeneratedValue
	Integer id;
	String status;
	int rack;
	int bookid;
	
	public Copies() {
		// TODO Auto-generated constructor stub
	}
	
	public Copies(Integer id, String status, int rack, int bookid) {
		super();
		this.id = id;
		this.status = status;
		this.rack = rack;
		this.bookid = bookid;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getRack() {
		return rack;
	}
	public void setRack(int rack) {
		this.rack = rack;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	@Override
	public String toString() {
		return "copies [id=" + id + ", status=" + status + ", rack=" + rack + ", bookid=" + bookid + "]";
	}
	
	
}

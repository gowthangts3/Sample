package org.api.omrbranch.APItesting.Pojo;

import javax.xml.crypto.Data;

public class RootPojo {
	
	
	////Output
	
	public int status;
    public String message;
    public Data data;
    public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public String getRefer_msg() {
		return refer_msg;
	}
	public void setRefer_msg(String refer_msg) {
		this.refer_msg = refer_msg;
	}
	public int getCart_count() {
		return cart_count;
	}
	public void setCart_count(int cart_count) {
		this.cart_count = cart_count;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String refer_msg;
    public int cart_count;
    public String role;

}

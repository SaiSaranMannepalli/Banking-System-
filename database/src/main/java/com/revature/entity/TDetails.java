package com.revature.entity;
import java.sql.Date;

public class TDetails{
	private String fromid;
	private String toid;
	private double transamount;
	private String date;
	
		public double getTransamount() {
		return transamount;
	}
	public void setTransamount(double transamount) {
		this.transamount = transamount;
	}

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getFromid() {
		return fromid;
	}
	public void setFromid(String fromid) {
		this.fromid = fromid;
	}
	public String getToid() {
		return toid;
	}
	public void setToid(String toid) {
		this.toid = toid;
	}
	

	public TDetails(String fromid, String toid,  double transamount,String date) {
		super();
		this.fromid = fromid;
		this.toid = toid;
		this.transamount = transamount;
		this.date=date;

	}
	@Override
	public String toString() {
		return "Transfer [fromid=" + fromid + ", toid=" + toid + ", transfered amount=" + transamount +", Date=" + date +  "]";
	}
	
	
	}

package com.mkyong.customer.model;

public class Customer{
	
	//checkbox
	boolean receiveNewsletter;
	String [] favLanguages;
	String [] favFramework;

	public String[] getFavFramework() {
		return favFramework;
	}
	public void setFavFramework(String[] favFramework) {
		this.favFramework = favFramework;
	}
	public boolean isReceiveNewsletter() {
		return receiveNewsletter;
	}
	public void setReceiveNewsletter(boolean receiveNewsletter) {
		this.receiveNewsletter = receiveNewsletter;
	}
	public String[] getFavLanguages() {
		return favLanguages;
	}
	public void setFavLanguages(String[] favLanguages) {
		this.favLanguages = favLanguages;
	}
	
}
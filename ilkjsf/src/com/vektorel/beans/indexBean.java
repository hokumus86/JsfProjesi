package com.vektorel.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="indexBean")
@SessionScoped
public class indexBean {

	private String ad="ilkkkkk de�er deneme";

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
		System.out.println(" deneme" + ad);
	}
	
	public void setAdi() {
		System.out.println(" deneme  " + ad);
	}
	
	
	
}

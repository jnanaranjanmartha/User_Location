package com.example.UserLocation;

 
public class ReaderUser {
	
	private String name;
	private double latitude, longitude;
	
	public String getName() {
		return name;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}
	
	 public ReaderUser() {
		
		super();
		// TODO Auto-generated constructor stub
	}
	
	 
	
	@Override
	public String toString() {
		return "AdminUser [name=" + name + ", latitude=" + latitude + ", longitude=" + longitude + "]";
	}

	
	public ReaderUser(String name, double latitude, double longitude) {
		super();
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	 

}

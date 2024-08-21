package com.keduit;

import org.json.simple.JSONObject;

public class Car {

private String carparkNm;
private String phoneNum;
private String addr;
private int parkCount;
private String parkType;

public Car(String carparkNm, String phoneNum, String addr, int parkCount, String parkType) {
	
	this.carparkNm = carparkNm;
	this.phoneNum = phoneNum;
	this.addr = addr;
	this.parkCount = parkCount;
	this.parkType = parkType;
	
	}
	
public String getcarparkNm() {
	return carparkNm;
}

public String getphoneNum() {
	return phoneNum;
}

public String getaddr() {
	return addr;
}

public int getparkCount() {
	return parkCount;
}
public String getparkType() {
	return parkType;
}

public void setcarparkNm(String carparkNm) {
	this.carparkNm = carparkNm;
}

public void setphoneNum(String phoneNum) {
	this.phoneNum = phoneNum;
}

public void setPublisher(String addr ) {
	this.addr = addr;
}

public void setPrice(int parkCount) {
	this.parkCount = parkCount;
}

public void setparkType(String parkType) {
	this.parkType = parkType;
}

@Override
public String toString() {
	return String.format("car[carparkNm=%s, phoneNum=%s, addr=%s, parkCount=%s, parkType=%s]", carparkNm, phoneNum, addr,
			parkCount, parkType);

}
}

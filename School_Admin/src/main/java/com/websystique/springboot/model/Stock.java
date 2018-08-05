package com.websystique.springboot.model;

public class Stock {
	private String[] data;

	public String[] getData() {
		return data;
	}

	public void setData(String[] data) {
		this.data = data;
	}
	
	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Personal Information:" + getData() + "\n");
        sb.append("*****************************");
        return sb.toString();
    }
	
}

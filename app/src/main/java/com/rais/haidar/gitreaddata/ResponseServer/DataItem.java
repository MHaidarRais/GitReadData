package com.rais.haidar.gitreaddata.ResponseServer;

import com.google.gson.annotations.SerializedName;

public class DataItem{

	@SerializedName("inggris")
	private String inggris;

	@SerializedName("id")
	private String id;

	@SerializedName("deskripsi")
	private String deskripsi;

	public void setInggris(String inggris){
		this.inggris = inggris;
	}

	public String getInggris(){
		return inggris;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setDeskripsi(String deskripsi){
		this.deskripsi = deskripsi;
	}

	public String getDeskripsi(){
		return deskripsi;
	}

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"inggris = '" + inggris + '\'' + 
			",id = '" + id + '\'' + 
			",deskripsi = '" + deskripsi + '\'' + 
			"}";
		}
}
package com.a3a3.fapp.emailaddress;

public class EmailaddressDto {

//	int -> Integer
//	vachar -> String
//  ★ seq은 int로 되어있지만 일일히 casting를 막기 위해 String으로 표기한다	
//  Dto에서는 반드시 Getter/Setter를 해야 한다	
	
	private String seq;
	private String email;
	private Integer rerepresenteEmail;
	private Integer addNaverAddress_seq;
//	-----
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getRerepresenteEmail() {
		return rerepresenteEmail;
	}
	public void setRerepresenteEmail(Integer rerepresenteEmail) {
		this.rerepresenteEmail = rerepresenteEmail;
	}
	public Integer getAddNaverAddress_seq() {
		return addNaverAddress_seq;
	}
	public void setAddNaverAddress_seq(Integer addNaverAddress_seq) {
		this.addNaverAddress_seq = addNaverAddress_seq;
	}
	
}

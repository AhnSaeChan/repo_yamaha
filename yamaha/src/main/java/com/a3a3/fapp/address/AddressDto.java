package com.a3a3.fapp.address;

public class AddressDto {
	private String seq;
	private String addressType;
	private String zipCode;
	private Integer searchZipCode;
	private String fullAddress;
	private Integer representAddress;
	private Integer addNaverAddress_seq;
//	-----
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public Integer getSearchZipCode() {
		return searchZipCode;
	}
	public void setSearchZipCode(Integer searchZipCode) {
		this.searchZipCode = searchZipCode;
	}
	public String getFullAddress() {
		return fullAddress;
	}
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}
	public Integer getRepresentAddress() {
		return representAddress;
	}
	public void setRepresentAddress(Integer representAddress) {
		this.representAddress = representAddress;
	}
	public Integer getAddNaverAddress_seq() {
		return addNaverAddress_seq;
	}
	public void setAddNaverAddress_seq(Integer addNaverAddress_seq) {
		this.addNaverAddress_seq = addNaverAddress_seq;
	}
	
}

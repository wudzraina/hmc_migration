package com.hcmmigration.main.model;



public class EmployeeAddress {


	private String HouseNo = "Nataraja Gootooru";
    private String Street = "Programmer";
    private String City= "";
    private String ZipCode= "";

	
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("************************************");
		sb.append("\neHouseNo: ").append(HouseNo);
		sb.append("\nStreet: ").append(Street);
        sb.append("\nZipCode: ").append(ZipCode);
        sb.append("\nCity: ").append(City);
		sb.append("\n************************************");
		return sb.toString();
	} 
	
	public String getHouseNo() {
		return HouseNo;
	}

	public void setHouseNo(String HouseNo) {
		this.HouseNo= HouseNo;
	}
 

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		this.Street = street;
    }
    
    
	public String getZipCode() {
		return Street;
	}

	public void setZipCode(String ZipCode) {
		this.ZipCode = ZipCode;
	}
    public String getCity() {
		return Street;
	}

	public void setCity(String city) {
		this.City = city;
	}
 
}
 

package com.hcmmigration.main.model;


public class iproute {
 
    private String ippfrom = "";
    private String ipto = "";
    private String line_1 = "";
    private String line_2 = "";
    private String country_Code = "";
    private String country = "";
	 
    public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append("************************************");
            // sb.append("\nempId: ").append(empId);
            // sb.append("\nname: ").append(name);
            // sb.append("\ndesignation: ").append(designation);
            // sb.append("\ndepartment: ").append(department);
            // sb.append("\nsalary: ").append(salary);
            sb.append("\n************************************");
            return sb.toString();
    }
	 
 

	public String getippfrom() {
		return ippfrom;
	}
	public void setippfrom(String v) {
		this.ippfrom = v;
	}
	public String getipto() {
		return ipto;
	}
	public void setName(String ipto) {
		this.ipto = ipto;
	}
	public String getLine1() {
		return line_1;
	}
	public void setline_1(String line_1) {
		this.line_1 = line_1;
	}
	public String getline_2() {
		return line_2;
    }
    
	public String setcountry_Code() {
		return country_Code;
	}

	public void setcountry_Code(String country_Code) {
		this.country_Code = country_Code;
	}
	public String getcountry() {
		return country;
	}
	public void setcountry(String country) {
		this.country = country;
	}	

}
 

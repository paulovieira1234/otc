/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dell.us.orc.resource;

/**
 *
 * @author Paulo_Vieira
 */
public class Orderdetails {
    
        private String order_number;
        private String org_id;
        private String country;
        private String flow_status_code;
        private String s100_status_name;
        private String s200_status_name;
        private String s300_status_name;
        private String s400_status_name;
        private String s500_status_name;
        private String s600_status_name;
        private String ordr_hold;
    
     public Orderdetails (String order_number, String org_id,
                String country,String flow_status_code,
                String s100_status_name,String s200_status_name,
                String s300_status_name,String s400_status_name,
                String s500_status_name,String s600_status_name,String ordr_hold){
            
            this.order_number = order_number;
            this.org_id = org_id;
            this.country = country;
            this.flow_status_code = flow_status_code;
            this.s100_status_name = s100_status_name;
            this.s200_status_name = s200_status_name;
            this.s300_status_name = s300_status_name;
            this.s400_status_name = s400_status_name;
            this.s500_status_name = s500_status_name;
            this.s600_status_name = s600_status_name;
            this.ordr_hold = ordr_hold;
         
         
     }

    public Orderdetails() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
     public void setOrder_number(String xx) {
        order_number = xx;
    }
    public String getOrder_number() {
        return order_number;
    }
public String getOrg_id(){
	return org_id;
	}
public String getCountry(){
    return country;
}
public String getFlow_status_code(){
    return flow_status_code;
}
public String getS100_status_name(){
    return s100_status_name;
}
public String getS200_status_name(){
    return s200_status_name;
}
public String getS300_status_name(){
    return s300_status_name;
}
public String getS400_status_name(){
        return s400_status_name;
}
public String getS500_status_name(){
    return s500_status_name;
}
public String getS600_status_name(){
    return s600_status_name;
}
public String getOrdr_hold(){
       return ordr_hold;
}
    
}

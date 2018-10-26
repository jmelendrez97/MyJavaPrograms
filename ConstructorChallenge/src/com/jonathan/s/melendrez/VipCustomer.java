package com.jonathan.s.melendrez;

import java.util.Arrays;

public class VipCustomer {
    private String field[] ={"","",""}; //0 - Name 1 - Credit Limit 2 - Email Address

    public VipCustomer() {
        this.field[0] = "No Name"; this.field[1] = "Undefined"; this.field[2] = "No Email Specified.";
    }
    public VipCustomer(String name, String credit_limit){
        this.field[0]=name; this.field[1]=credit_limit;
    }
    public VipCustomer(String name, String credit_limit, String email){
        this.field[0]=name; this.field[1]=credit_limit; this.field[2]=email;
    }

    //getters

    public String getName() { return field[0]; } public String getCreditLimit(){return field[1];} public String getEmail(){return field[2];}

}

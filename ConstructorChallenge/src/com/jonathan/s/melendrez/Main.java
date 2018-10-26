package com.jonathan.s.melendrez;

public class Main {

    public static void main(String[] args) {
        displayCustomer();
    }

    private static final void displayCustomer(){
        VipCustomer newCustomer = new VipCustomer("Bong","69,000 lmao","meme@meme.com");
        System.out.println(newCustomer.getName());
        System.out.println(newCustomer.getCreditLimit());
        System.out.println(newCustomer.getEmail());
    }
}

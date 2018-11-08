package com.accenture.tcf.codingassessment.inheritance;

public class Main {

    public static void main(String[] args) {
	ShoppingClerk clerk = new ShoppingClerk("Bong");

	    Item item1 = new Item("Panteen Shampoo",25.00,false,0.00);
        Item item2 = new Item("Creamsilk Conditioner",30.00,false,0.00);
        Item item3 = new Item("Colgate Toothpaste",100.00,true,0.10);
        Item item4 = new Item("Safeguard Soap",50.00,true,0.20);
        Item item5 = new Item("Pond's facial wash",75.00,false,0.00);

        GroceryBill gb = new RegularBill(clerk);
        gb.addItem(item1); gb.addItem(item2); gb.addItem(item3); gb.addItem(item4); gb.addItem(item5);
        //gb.printReceipt();

        GroceryBill db = new DiscountedBill(clerk);
        db.addItem(item1); db.addItem(item2); db.addItem(item3); db.addItem(item4); db.addItem(item5);
        //printReceipt();

        gb.printReceipt();
        db.printReceipt();
    }
}

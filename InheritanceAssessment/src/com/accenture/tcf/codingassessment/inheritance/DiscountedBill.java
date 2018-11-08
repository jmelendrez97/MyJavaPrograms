package com.accenture.tcf.codingassessment.inheritance;

public class DiscountedBill extends GroceryBill {
    public DiscountedBill(ShoppingClerk clerk) {
        super(clerk);
    }

    public double getTotalBill() {
        double total=0;
        for(int i=0; i<items.length;i++){
            if(items[i] != null){
                if(items[i].isDiscounted()){
                    //total = ((total+ items[i].getPrice()) *((items[i].getDiscountPercentage()/100) * items[i].getPrice()));
                    total += items[i].getPrice() - (items[i].getPrice()*items[i].getDiscountPercentage());
                }
                else{
                    total += items[i].getPrice();
                }
            }else {

                break;
            }
        }
        return total;
    }
}

package com.accenture.tcf.codingassessment.inheritance;

public class RegularBill extends GroceryBill{

    public RegularBill(ShoppingClerk clerk) {
        super(clerk);
    }

    public double getTotalBill(){
        double total=0;
        for(int i=0; i<items.length;i++){
            if(items[i] != null){
                total += items[i].getPrice();
            }else {
                break;
            }
        }
        return total;


    }

    /*public void printReceipt(){
        GroceryBill rgb = new RegularBill(clerk);
            GroceryBill dsb = new DiscountedBill(clerk);
            System.out.println(rgb.getClass().getName());

        String[] head = {"  >>REGULAR BILL<<  ", "  >>DISCOUNTED BILL<<  "};
        String rp1 = head[0]
                +"\nClerk: "+clerk.getName()
                +"\nItem Name      Item Price"
                +"\n-----------------------------";
        System.out.print(rp1);
        for (Item item : items) {
            if(item!=null){
                System.out.println("\n"+item.getName() + "      " +getTotalBill());}

        }
        System.out.println("Total bill:" +getTotalBill());
        //----------------------------------------------------------------------------
        String rp2 = head[1]
                +"\nClerk: "+clerk.getName()
                +"\nItem Name      Item Price"
                +"\n-----------------------------";
        System.out.println(rp2);
        for (Item item:items){
            if(item!=null){
                System.out.println("\n"+item.getName() + "      " +item.getPrice());}
        }
        System.out.println("Total bill:" +dsb.getTotalBill());



    }*/

}

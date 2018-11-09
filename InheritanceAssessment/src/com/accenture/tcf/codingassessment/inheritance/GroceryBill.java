package com.accenture.tcf.codingassessment.inheritance;

public abstract class GroceryBill {
    protected Item[] items = new Item[200];
    private ShoppingClerk clerk;

    public GroceryBill(ShoppingClerk clerk) {
        this.clerk = clerk;
    }

    public void addItem(Item item){
        for(int i=0; i < items.length;i++){
            if(items[i] == null){
                items[i] = item;
                break;
            }
        }
    }
        public void printReceipt(){
        /*GroceryBill rgb = new RegularBill(clerk);
            System.out.println(rgb.getClass().getName());*/
        int counter =0;


       // String[] head ={"   >>REGULAR BILL<<    ","   >>REGULAR BILL<<    "};
        String rp1 = "\nClerk: "+clerk.getName()
                    +"\nItem Name      Item Price"
                    +"\n-----------------------------";
            System.out.print(rp1);
            for (Item item : items) {
                if(item!=null){
                System.out.println("\n"+item.getName() + "      " +item.getPrice());}
                counter++;

            }
            System.out.println("Total bill:" +getTotalBill());

            //----------------------------------------------------------------------------
            /*String rp2 = head[1]
                    +"\nClerk: "+clerk.getName()
                    +"\nItem Name      Item Price"
                    +"\n-----------------------------";
            System.out.println(rp2);
            for (Item item:items){
                if(item!=null){
                System.out.println("\n"+item.getName() + "      " +item.getPrice());}
            }
            System.out.println("Total bill:" +getTotalBill());*/


        }
        abstract double getTotalBill();

    }


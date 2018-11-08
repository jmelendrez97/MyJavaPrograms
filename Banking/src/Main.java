public class Main {

    public static void main(String[] args){
        Bank bank = new Bank("Lively " +
                                    "International " +
                                    "General " +
                                    "Macro " +
                                    "Association " +
                                    "Bank " +
                                    "Africa, " +
                                    "Licensed " +
                                    "Level " +
                                    "Security.");

        bank.addBranch("Sugondese");
        bank.addCustomer("Sugondese","Tim Buchatka", 69.420);
        bank.addCustomer("Sugondese","Bitchass", 420);
        bank.addCustomer("Sugondese", "Nuts", 69);

        bank.addBranch("Meme");
        bank.addCustomer("Meme","God",500);
        bank.addCustomer("Meme","Godzilla",100);

        bank.addCustomerTransaction("Sugondese","Nuts",70);

        bank.listCustomers("Sugondese",true);
    }
}

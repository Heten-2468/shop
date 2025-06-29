import java.util.Scanner;
public class Cashier {
    //Create one more class wallet which will extend ShoppingCart, there will be
// different methods in the wallet class, which will generate the bill and update and
// recharge the wallet  balance accordingly.
//Note - It will also display an appropriate message if the wallet balance is less
// than the shopping cart value.
    private double account = 25.0;
    Scanner scanner = new Scanner(System.in);
    ShoppingCart cart = new ShoppingCart();
    public Cashier() {
        System.out.println("Welcome to the Luxury Shopping Portal...");
    }

    public void buy() {
        double totalPrice = 0.0;
        int code = -1;
        System.out.println("To continue shopping... \n Press 1 to buy Fruits \n Press 2 to buy Vegetables \n Press 3 to buy Oils" +
                "\n Press 4 to buy Stationaries \n Press 5 to buy Apparels \n Press 0 to exit. ");
        while (code != 0) {
            System.out.println("Please input a number or press 0 to exit. ");
            code = scanner.nextInt();
            totalPrice += cart.price(code);
        }
        if (totalPrice == 0.0) {
            System.out.println("Please buy something...");
        } else {
            if (totalPrice > account) {
                System.out.println("Insufficient Account Balance... \n Redirectering you to Recharging Your account... \n Require " + (totalPrice - account) + " more");
                int i = 1;
                while(true){
                    System.out.println("To continue to recharging Press 1 or Press 0. ");
                    i = scanner.nextInt();
                    if (i == 0){
                        break;
                    } else if (i == 1){
                        recharge();
                        double needed = (totalPrice < account) ? 0 : (totalPrice - account);
                        System.out.println("You need " + ((needed == 0) ? "no" : needed) + " more dollars to buy the cart. ");
                    }
                }
            } if (totalPrice <= account) {
                account -= totalPrice;
                System.out.println("Your total bill is " + totalPrice + ". Your total account balance is " + account);
            } else {
                System.out.println("The Purchase was not made. ");
            }
        }

    }

    public void recharge() {
        System.out.println("\n Please enter the amount to add to the wallet. ");
        double recharge = scanner.nextDouble();
        account += recharge;
        System.out.println("Your new account balance is " + account);
    }

    public void showAccount() {
        System.out.println("Your current account balance is " + account);
    }

    public void shop() {

        while (true) {
            System.out.println("Please tell us what you would like to do? \n Press 1 to start shopping. " +
                    "\n Press 2 to check your account balance. \n Press 3 to recharge your wallet. \n Press 0 to exit.");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    buy();

                    break;
                case 2:
                    showAccount();
                    break;
                case 3:
                    recharge();
                    break;
                case 0:
                    System.out.println("Looking forward to seeing you again...");
                    return;
                default:
                    System.out.println("Please enter a valid number. ");
            }


        }
    }
}

public class ShoppingCart extends ShoppingList {
    //Create another class ShoppingCart that will extend ShoppingList, there will be a
    // method price in ShoppingCart, which will calculate the price of the shopping item.

    public double price(int itemCode) {
        String itemName = List(itemCode);
        switch (itemName) {
            case "Fruits":
                return 2.50;

            case "Vegetables":
                return 1.90;

            case "Oils":
                return 1.00;

            case "Stationaries":
                return 4.50;

            case "Apparels":
                return 5.00;

            default:
                return 0.0;
        }

    }

}
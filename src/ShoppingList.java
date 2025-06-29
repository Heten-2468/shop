public class ShoppingList {
    private String itemName;

    public String getItemName() {
        return itemName;
    }

    public String List(int itemCode){
        switch (itemCode){
            case 1:
                itemName = "Fruits";
                System.out.println("Item name is " + itemName);
                return itemName;

            case 2:
                itemName = "Vegetables";
                System.out.println("Item name is " + itemName);
                return itemName;

            case 3:
                itemName = "Oils";
                System.out.println("Item name is " + itemName);
                return itemName;

            case 4:
                itemName = "Stationaries";
                System.out.println("Item name is " + itemName);
                return itemName;

            case 5:
                itemName = "Apparels";
                System.out.println("Item name is " + itemName);
                return itemName;

            default:
                itemName ="null";
                System.out.println("Please enter the right item code. ");
                return itemName;
        }

    }

}

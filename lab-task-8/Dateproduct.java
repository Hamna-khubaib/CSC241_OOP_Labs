public class DateProduct {

    private static int counter = 0;
    private static double maxPrice;
    private static double minPrice;   

    private String id;
    private String name;
    private double price;
    private int quantity;
    private Date mf;

    public DateProduct(String name, double price, int quantity) {
        this(name, price, quantity, new Date(1, 1, 1));
    }

    public DateProduct(String name, double price, int quantity, Date mf) {
        counter++;
        this.id = String.format("p%03d", counter);
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.mf = mf;

        if (counter == 1) {
            minPrice = price;
            maxPrice = price;
        } else {
            if (price > maxPrice) {
                maxPrice = price;
            }
            if (price < minPrice) {
                minPrice = price;
            }
        }
    }

    public void display() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Price: " + this.price);
        System.out.println("Quantity: " + this.quantity);
        System.out.println("Manufacturing Date: " + this.mf.displayDate());
        System.out.println();
    }

    public static void displaymaxmin() {
        System.out.println("Max Price: " + maxPrice);
        System.out.println("Min Price: " + minPrice);
    }
}

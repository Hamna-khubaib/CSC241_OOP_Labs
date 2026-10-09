public class demo2 {
    public static void main(String[] args) {

   
        Date d1 = new Date(1, 1, 2024);
        Date d2 = new Date(15, 3, 2024);
        Date d3 = new Date(10, 5, 2024);
        Date d4 = new Date(8, 10, 2024);

        DateProduct p1 = new DateProduct("Laptop", 50000.0, 2, d1);
        DateProduct p2 = new DateProduct("Mobile", 25000.0, 5, d2);
        DateProduct p3 = new DateProduct("Keyboard", 1500.0, 10, d3);
        DateProduct p4 = new DateProduct("Mouse", 800.0, 15, d4);

        p1.display();
        p2.display();
        p3.display();
        p4.display();

        DateProduct.displaymaxmin();
    }
}

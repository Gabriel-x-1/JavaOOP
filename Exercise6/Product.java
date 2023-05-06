package Cor_6;

public class Product {
    String name_p;
    double price_rol;

    public Product(String name, double price) {
        name_p = name;
        price_rol = price;
    }

    public void displayProduct() {
        System.out.println(name_p);
    }

    public double getPrice() {
        return price_rol;
    }

    public void setPrice(double price) {
        price_rol = price;
    }

    public double getPriceInRON() {
        return price_rol / 10000;
    }

    public void setPriceInRON(double price) {
        price_rol = price * 10000;
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 10000);
        p1.displayProduct();
        System.out.println(p1.getPrice() + "ROL");
        p1.setPrice(100000);
        System.out.println(p1.getPriceInRON() + "RON");
        p1.setPriceInRON(5000);
        System.out.println(p1.getPrice() + "ROL");
        System.out.println(p1.getPriceInRON() + "RON");

    }
}

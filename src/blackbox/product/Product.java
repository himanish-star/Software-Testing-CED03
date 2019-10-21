package blackbox.product;

public class Product {
    private String name;
    private int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int amount() {
        return this.price;
    }

    public int amount(int qty) {
        return qty * this.price;
    }

    String printBill(int qty) {
        return(String.format("Product name: %s | Price: %d x Qty: %d", this.name, this.price, qty));
    }
}

class Household extends Product {
    Household(String name, int price) {
        super(name, price);
    }

    String printBill(int qty) {
        return("[Household]" + super.printBill(qty));
    }
}

class Grocery extends Household {
    Grocery(String name, int price) {
        super(name, price);
    }

    String printBill(int qty) {
        return("[Grocery]" + super.printBill(qty));
    }
}

class Electronic extends Product {
    Electronic(String name, int price) {
        super(name, price);
    }

    String printBill(int qty) {
        return("[Electronic]" + super.printBill(qty));
    }
}

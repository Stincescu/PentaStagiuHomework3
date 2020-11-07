package Shop;

public class Product {
    int id;
    String name;
    int price;

    Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

class Book extends Product{
    String author;
    Book(int id, String name, int price,String author ){
        super(id, name, price);
        this.author = author;

    }
}
class Candy extends Product{
    int quantity;

    Candy(int id, String name, int price, int quantity) {
        super(id, name, price);
        this.quantity = quantity;
    }
}

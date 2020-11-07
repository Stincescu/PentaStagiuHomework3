package Shop;

public class Candy implements Product{
    int id;
    String name;
    int price;
    int quantity;

    Candy(int id, String name, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        }
}

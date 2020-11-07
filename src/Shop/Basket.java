package Shop;

public class Basket {

    static double totalPrice;
    Basket(Customer customer){
        System.out.println("This is the basket");
    }

    void addToBasket(Book book){
        totalPrice = totalPrice + book.price;
    }
    void addToBasket(Candy candy){
        totalPrice = totalPrice + candy.quantity * candy.price;
    }

    static double getTotalPrice(Customer.Membership membership){
        switch(membership){
            case NO:
                return totalPrice;
            case SILVER:
                return totalPrice - 0.1 * totalPrice;
            case GOLD:
                return totalPrice - 0.2 * totalPrice;
            default:
                return 0;
        }

    }
    public static void main(String[] args){
        Customer customer1 = new Customer();
        customer1.setMembership(Customer.Membership.GOLD);
        Book book1 = new Book(1, "Inteligenta emotionala",32, "Goldman");
        Book book2 = new Book(1, "Minialism Digital", 10, "IDKAUTHOR");
        Candy jelly = new Candy(2,"Jeleuri dulci", 2, 2 );
        Basket basket1 = new Basket(customer1);
        basket1.addToBasket(book1);
        basket1.addToBasket(book2);
        basket1.addToBasket(jelly);
        System.out.println("For now, you have to pay, with a discount: " + getTotalPrice(customer1.membership));
        customer1.setMembership(Customer.Membership.SILVER);
        System.out.println("For now, you have to pay, with a different discount: " + getTotalPrice(customer1.membership));






    }
}

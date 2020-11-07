package Shop;

public class App {
    public static void main(String[] args){
        Customer customer1 = new Customer();
        customer1.setMembership(Membership.GOLD);
        Book book1 = new Book(1, "Inteligenta emotionala",32, "Goldman");
        Book book2 = new Book(1, "Minialism Digital", 10, "IDKAUTHOR");
        Candy jelly = new Candy(2,"Jeleuri dulci", 2, 2 );
        Basket basket1 = new Basket(customer1);
        basket1.addToBasket(book1);
        basket1.addToBasket(book2);
        basket1.addToBasket(jelly);
        System.out.println("For now, you have to pay, with a discount: " + basket1.getTotalPrice(customer1.membership));
        customer1.setMembership(Membership.SILVER);
        System.out.println("For now, you have to pay, with a different discount: " + basket1.getTotalPrice(customer1.membership));






    }
}

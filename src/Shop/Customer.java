package Shop;

public class Customer {
    int id;
    String name;
    public enum Membership { GOLD, SILVER, NO}
    Membership membership;

    Customer(){
        this.membership = Membership.NO;
    }

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }
}

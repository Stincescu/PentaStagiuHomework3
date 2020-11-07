package BankAccountApp;

public class App {
    public static void main(String[] args){
        BankAccount Account = new BankAccount();
        Account.chooseOption(Option.withdraw, 1500);
        Account.chooseOption(Option.deposit, 1500);
        Account.chooseOption(Option.withdraw, 2500);
        Account.chooseOption(Option.withdraw, 2);
    }
}

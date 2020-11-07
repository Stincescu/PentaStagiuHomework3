package BankAccountApp;

public class BankAccount {
    public enum Option { withdraw, deposit }
    static double accountSum = 2500;

    void withdrawFromAccount(double withdrawAmount){
        if(withdrawAmount > accountSum){
            System.out.println("You can not withdraw such a big amount");
        }
        else{
            accountSum = accountSum - withdrawAmount;
            System.out.println("You have just withdrawn " + withdrawAmount + "lei");
            System.out.println("Account balance: " + accountSum);
        }
    }
    void makeDeposit(double depositAmount){
        accountSum = accountSum + depositAmount;
        System.out.println("You have just made a deposit of:" + depositAmount);
        System.out.println("Account balance:" + accountSum);
    }
    void chooseOption(Option option, double amount){

        switch(option){
            case withdraw:
                System.out.println("You have chosen to make a withdraw");
                withdrawFromAccount(amount);
                break;
            case deposit:
                System.out.println("You have chosen to make a deposit");
                makeDeposit(amount);
                break;
            default:
                System.out.println("Wrong option, you can choose from: withdraw and deposit");
                break;
        }

    }

    public static void main(String[] args){
        BankAccount Account = new BankAccount();
        Account.chooseOption(Option.withdraw, 1500);
        Account.chooseOption(Option.deposit, 1500);
        Account.chooseOption(Option.withdraw, 2500);
        Account.chooseOption(Option.withdraw, 2);
    }


}



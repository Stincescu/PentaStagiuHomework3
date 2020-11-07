package BoardPostsApp;

public class Board {

    static void displayMessage(User user, Message message) {
        user.PostAMessage(user, message);
    }

    public static void main(String[] args) {

        User user1 = new User("Sebastian","sebastian@gmail.com");
        Message message1 = new Message("Message 1" ,user1.name);
        Message message2 = new Message("Message 2", user1.name);
        displayMessage(user1,message1);
        displayMessage(user1,message2);


    }

}
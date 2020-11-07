package BoardPostsApp;

public class App {
    public static void main(String[] args) {
        Board board = new Board();
        User user1 = new User("Sebastian","sebastian@gmail.com");
        Message message1 = new Message("Message 1" ,user1.name);
        Message message2 = new Message("Message 2", user1.name);
        board.displayMessage(user1,message1);
        board.displayMessage(user1,message2);


    }
}

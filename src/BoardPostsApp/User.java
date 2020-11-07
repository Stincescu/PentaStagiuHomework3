package BoardPostsApp;

public class User {
    String name;
    String email;

    User(String name, String email){
        this.name = name;
        this.email = email;
    }
    void PostAMessage(User user,Message message){
        System.out.println("Username: " + user.name);
        System.out.println("User email: " + user.email);
        //message.author = user.name;
        //message.description = "Message description of user: " + message.author;
        System.out.println("Message author: " + message.author);
        System.out.println("Message description: " + message.description);

    }
}

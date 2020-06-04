package predicate;

import java.util.Scanner;
import java.util.function.Predicate;

class User {
    String userName;
    String pwd;

    User(String userName, String pwd) {
        this.userName = userName;
        this.pwd = pwd;
    }
}
public class UserAuthentication {
    public static void main(String[] args) {
        Predicate<User> p = user -> user.userName.equals("User") && user.pwd.equals("password");

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter user name: ");
        String userName = scan.next();
        System.out.print("Please enter user password: ");
        String pwd = scan.next();

        User user = new User(userName, pwd);

        if(p.test(user)) {
            System.out.println("You have got full privileges");
        } else {
            System.out.println("Please provide the right user name or login");
        }
    }
}

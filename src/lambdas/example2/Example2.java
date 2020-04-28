package lambdas.example2;

import java.util.Scanner;
import java.util.function.Predicate;

public class Example2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String userName = scanner.next();
        System.out.println("Please enter your password: ");
        String userPassword = scanner.next();
        User user = new User(userName, userPassword);
        Predicate<User> p = userCredentials ->
                userCredentials.getUserName().equals("vlad") &&
                userCredentials.getUserPassword().equals("12345");
        if (p.test(user)) {
            System.out.println("You got full privileges");
        } else {
            System.out.println("You have provided wrong user name or password");
        }
    }
}
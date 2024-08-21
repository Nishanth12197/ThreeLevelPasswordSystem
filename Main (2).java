import java.util.Scanner;

class TextualPassword {
    private String correctPassword1 = "nishanth";
    private String correctPassword2 = "gitam";

    public boolean authenticate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first password: ");
        String inputPassword1 = scanner.nextLine();
        System.out.print("Enter your second password: ");
        String inputPassword2 = scanner.nextLine();
        return correctPassword1.equals(inputPassword1) && correctPassword2.equals(inputPassword2);
    }
}

class GraphicalPassword {
    private String correctPattern1 = "1-3-5"; 
    private String correctPattern2 = "2-4-6"; 

    public boolean authenticate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select the first pattern: ");
        String inputPattern1 = scanner.nextLine();
        System.out.print("Select the second pattern: ");
        String inputPattern2 = scanner.nextLine();
        return correctPattern1.equals(inputPattern1) && correctPattern2.equals(inputPattern2);
    }
}

class BehavioralPassword {
    private String correctTypingPattern1 = "1234";
    private String correctTypingPattern2 = "5678";

    public boolean authenticate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the first pattern: ");
        String inputPattern1 = scanner.nextLine();
        System.out.print("Type the second pattern: ");
        String inputPattern2 = scanner.nextLine();
        return correctTypingPattern1.equals(inputPattern1) && correctTypingPattern2.equals(inputPattern2);
    }
}

public class Main {

    public static void main(String[] args) {
        TextualPassword textualPassword = new TextualPassword();
        GraphicalPassword graphicalPassword = new GraphicalPassword();
        BehavioralPassword behavioralPassword = new BehavioralPassword();

        if (textualPassword.authenticate()) {
            System.out.println("Textual Passwords Accepted.");
            if (graphicalPassword.authenticate()) {
                System.out.println("Graphical Patterns Accepted.");
                if (behavioralPassword.authenticate()) {
                    System.out.println("Behavioral Patterns Accepted.");
                    System.out.println("Access Granted!");
                } else {
                    System.out.println("Behavioral Authentication Failed.");
                }
            } else {
                System.out.println("Graphical Authentication Failed.");
            }
        } else {
            System.out.println("Textual Authentication Failed.");
        }
    }
}

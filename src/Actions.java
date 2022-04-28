import java.util.HashMap;
import java.util.Scanner;

public class Actions {
    static HashMap<String, Staff> staffDatas = new HashMap<>();
    static Scanner scan = new Scanner(System.in);
    static Staff staff1 = new Staff("Mike", "Hammens", "0102030405", "mike@abc.com", "mhammens", "mike123");
    static Staff staff2 = new Staff("Mily", "Rammens", "0102030406", "mily@abc.com", "mrammens", "mily123");
    static Staff staff3 = new Staff("Nely", "Rammons", "0102030407", "nely@abc.com", "nrammons", "nely123");


    public static void staffRegistrate() {
        staffDatas.put(staff1.getUserName(), staff1);
        staffDatas.put(staff2.getUserName(), staff2);
        staffDatas.put(staff3.getUserName(), staff3);
    }

    public static void staffWelcomeScreen() {
        System.out.print("Welcome to staff window\n Enter username: ");
        String usernameInput = scan.nextLine();
        if (usernameInput.equals(staff1.getUserName())) {
            System.out.println("Enter your password: ");
            String passwordInput = scan.nextLine();
            if (passwordInput.equals(staff1.getPassword())) {
                mainWindow();
            } else {
                System.out.println("Wrong password!");
                staffWelcomeScreen();
            }
        } else if (usernameInput.equals(staff2.getUserName())) {
            System.out.println("Enter your password: ");
            String passwordInput = scan.nextLine();
            if (passwordInput.equals(staff2.getPassword())) {
                mainWindow();
            } else {
                System.out.println("Wrong password!");
                staffWelcomeScreen();
            }
        }else if (usernameInput.equals(staff3.getUserName())) {
            System.out.println("Enter your password: ");
            String passwordInput = scan.nextLine();
            if (passwordInput.equals(staff3.getPassword())) {
                mainWindow();
            } else {
                System.out.println("Wrong password!");
                staffWelcomeScreen();
            }
        }else {
            System.out.println("enter a valid username!");
            staffWelcomeScreen();
        }


    }

    private static void mainWindow() {
        System.out.println("**** welcome to main menu ****\n" +
                "for student window enter 1\n" +
                "for teacher window enter 2\n" +
                "for settings enter 3");
        String choice=scan.next();
        switch (choice){
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            default:
                break;
        }
    }
}

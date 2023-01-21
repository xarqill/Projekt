import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // Utawianie userName przez użytkownika
        private static String createUserName() {
            while (true) {
                System.out.print("Podaj swój nick: ");
                String userName = scanner.nextLine();

                if (userName.length() < 5) {
                    System.out.println("Nazwa użytkownika nie może być krótsza niż 5 znaków!");
                    System.out.println();
                } else if (userName.length() > 12) {
                    System.out.println("Nazwa użytkownika nie może być dłuższa niż 12 znaków!");
                    System.out.println();
                } else {
                    System.out.println("Twoja nazwa użytkownika: " + userName);
                    System.out.println();
                    System.out.println();
                    return userName;
                }
            }
        }

    }
}



}

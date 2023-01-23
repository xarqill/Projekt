import java.util.*;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Character character = new Character(createUserName(), createProfession());
        Monster monster = new Monster("Pies", 1, 2, 1, 5, 5, 1);
        Fight fight = new Fight();

        mapChoice(character);
    }

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


    // Wybieranie profesji przez użytkownika
    private static String createProfession() {
        String profession;

        while (true) {
            System.out.println("Dostępne profesje: [1] Wojownik || [2] Paladyn || [3] Zwiadowca || [4] Mag");
            System.out.print("Wybierz profesję postaci: ");
            int chooseProfession = scanner.nextInt();

            if (chooseProfession == 1) {
                profession = "Wojownik";
                System.out.println("Wybrałeś profesję: " + profession);
                System.out.println();
                System.out.println();
                return profession;
            } else if (chooseProfession == 2) {
                profession = "Paladyn";
                System.out.println("Wybrałeś profesję: " + profession);
                System.out.println();
                System.out.println();
                return profession;
            } else if (chooseProfession == 3) {
                profession = "Zwiadowca";
                System.out.println("Wybrałeś profesję: " + profession);
                System.out.println();
                System.out.println();
                return profession;
            } else if (chooseProfession == 4) {
                profession = "Mag";
                System.out.println("Wybrałeś profesję: " + profession);
                System.out.println();
                System.out.println();
                return profession;
            } else {
                System.out.println("Wybierz odpowiednią profesję!");
                System.out.println();
                System.out.println();
            }
        }
    }

    private static void printBasicInformation(Character character) {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Nazwa użytkownika: " + character.getUserName());
        System.out.println("Profesja: " + character.getProfession());
        System.out.println("Poziom: " + character.getLevel());
        System.out.println("Doświadczenie: " + character.getExperience());
        System.out.println("Złoto: " + character.getGold());
        System.out.println();
        System.out.println("Punkty życia: " + character.getHealthPoints());
        System.out.println("Obrażenia: " + character.getDamage());
        System.out.println("-----------------------------------------------------------");
    }

    private static void printBasicInformation(Monster monster) {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Nazwa: " + monster.getName());
        System.out.println("Poziom: " + monster.getLevel());
        System.out.println("Doświadczenie: " + monster.getExperience());
        System.out.println("Złoto: " + monster.getGold());
        System.out.println();
        System.out.println("Punkty życia: " + monster.getHealthPoints());
        System.out.println("Obrażenia: " + monster.getDamage());
        System.out.println("-----------------------------------------------------------");
    }

    // Wybieranie mapy przez użytkownika na której będzie expić
    private static void mapChoice(Character character) {
        ArrayList<Location> locations = new ArrayList<Location>();

        Location location1 = new Location("Zapadlisko", 1);
        Location location2 = new Location("Polana", 5);
        Location location3 = new Location("Jaskinia", 10);

        locations.add(location1);
        locations.add(location2);
        locations.add(location3);

        while (true) {
            for (int i = 0; i < locations.size(); i++) {
                System.out.println("[" + (i+1) + "] " +  locations.get(i).getName());
            }

            System.out.print("Wybierz mapę: ");
            int choice = scanner.nextInt();

            if (choice == 1 && location1.entryToLocation(character)) {
                return;
            } else if (choice == 2 && location2.entryToLocation(character)) {
                return;
            } else if (choice == 3 && location3.entryToLocation(character)) {
                return;
            }
        }
    }
}

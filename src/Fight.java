public class Fight {
    // Walka między postacią a potworem
    public void letsFight(Character character, Monster monster) {
        System.out.println();
        System.out.println("Toczysz walkę z przeciwnikiem: " + monster.getName());
        System.out.println();

        int fightRound = 0;
        while (character.getHealthPoints() > 0 || monster.getHealthPoints() > 0) {
            fightRound++;

            if (character.getHealthPoints() <= 0) {
                System.out.println();
                System.out.println("Przegrałeś walkę z przeciwnikiem: " + monster.getName());
                System.out.println("--------------------------------------------------------------------------");
                healthPointsRegeneration(character);
                healthPointsRegenation(monster);
                return;
            }

            monster.setHealthPoints(monster.getHealthPoints() - character.getDamage());
            System.out.println("[" + fightRound + "] " + "Zadałeś przeciwnikowi " + character.getDamage() + " obrażeń");

            if (monster.getHealthPoints() <= 0) {
                System.out.println();
                System.out.println("--------------------------------------------------------------------------");
                System.out.println("Wygrałeś walkę z przeciwnikiem: " + monster.getName());
                System.out.println();
                winFight(character, monster);
                character.checkLevelUp();
                healthPointsRegeneration(character);
                healthPointsRegenation(monster);
                return;
            }

            character.setHealthPoints(character.getHealthPoints() - monster.getDamage());
            System.out.println("[" + fightRound + "] " + "Utraciłeś " + monster.getDamage() + "hp od ataku przeciwnika");
        }
    }

    // Przydzielenie nagród po wygranej walce
    public void winFight(Character character, Monster monster) {
        if (character.getHealthPoints() > 0) {
            System.out.println("Zdobyłeś: " + monster.getExperience() + " doświadczenia i " + monster.getGold() + " złota");
            System.out.println("--------------------------------------------------------------------------");
            System.out.println();
            character.setExperience(character.getExperience() + monster.getExperience());
            character.setGold(character.getGold() + monster.getGold());
        }
    }

    public void healthPointsRegeneration(Character character) { // Regenerowanie hp do 100% po każdej walce (postać)
        character.setHealthPoints(character.getMaxHealthPoints());
    }

    public void healthPointsRegenation(Monster monster) { // Regenerowanie hp do 100% po każdej walce (potwór)
        monster.setHealthPoints(monster.getMaxHealthPoints());
    }
}

public class Character {
    private final String userName;
    private final String profession;
    private final int maxLevel = 300;
    private int level = 1;
    private int experience = 0;
    private int requiredExperience = 10;
    private int gold = 0;
    private int healthPoints = 15;
    private int damage = 1;

    public Character(String userName, String profession) {
        this.userName = userName;
        this.profession = profession;
    }

    public boolean isEnaughExperienceToLevelUp() {
        return getExperience() >= requiredExperience; // Sprawdzamy czy exp >= reqExp | Jeśli tak = zwraca true | Jeśli nie = zwraca false
    }

    // Sprawdzenie czy gracz może awansować na wyższy poziom, jeśli tak to level zwiększa się +1
    public void checkLevelUp() {
        if (isEnaughExperienceToLevelUp() && getLevel() < maxLevel) {
            setExperience(getExperience() - requiredExperience);
            setLevel(getLevel() + 1);
            requiredExperience = (requiredExperience * 5) / 4;
        }
    }

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getRequiredExperience() {
        return requiredExperience;
    }

    public void setRequiredExperience(int requiredExperience) {
        this.requiredExperience = requiredExperience;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}

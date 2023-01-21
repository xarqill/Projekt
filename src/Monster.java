import java.util.Objects;

public class Monster {
    private final String name;
    private final int level;
    private int experience;
    private int gold;
    private int healthPoints;
    private int damage;

    public Monster(String name, int level, int experience, int gold, int healthPoints, int damage) {
        this.name = name;
        this.level = level;
        this.experience = experience;
        this.gold = gold;
        this.healthPoints = healthPoints;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
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


    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", experience=" + experience +
                ", gold=" + gold +
                ", healthPoints=" + healthPoints +
                ", damage=" + damage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monster monster = (Monster) o;
        return level == monster.level
                && experience == monster.experience
                && gold == monster.gold
                && healthPoints == monster.healthPoints
                && damage == monster.damage
                && Objects.equals(name, monster.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, level, experience, gold, healthPoints, damage);
    }
}

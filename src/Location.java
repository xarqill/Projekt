import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Location {
    private final String name;
    private final int minLevel;

    Location(String name, int minLevel) {
        this.name = name;
        this.minLevel = minLevel;
    }

    public boolean entryToLocation(Character character) {
        if (character.getLevel() < getMinLevel()) {
            System.out.println();
            System.out.println("Masz za niski poziom, aby wejść do tej lokacji!");
            System.out.println();
            return false;
        }
        else {
            System.out.println();
            System.out.println("Aktualna mapa: " + getName());
            System.out.println();
            return true;
        }
    }

    public String getName() {
        return name;
    }

    public int getMinLevel() {
        return minLevel;
    }


    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", minLevel=" + minLevel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return minLevel == location.minLevel && Objects.equals(name, location.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, minLevel);
    }
}

public class Medic extends Hero {
    private double healPoints;

    public Medic(int health, int damage, double healPoints) {
        super(health, damage, "HEALING");
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил супер способность HEALING");
    }

    public void increaseExperience() {
        healPoints *= 1.1; // Увеличиваем на 10%
    }
}


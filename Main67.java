import java.util.Random;

public class Main67 {
    public static void main(String[] args) {
        Random random = new Random();
        int numPrivates = random.nextInt(11);
        int numCorporals = random.nextInt(11);
        int numCaptains = random.nextInt(11);
        int numMajors = random.nextInt(11);

        General general1 = new General("General 1", 100, numPrivates, numCorporals, numCaptains, numMajors);

        numPrivates = random.nextInt(11);
        numCorporals = random.nextInt(11);
        numCaptains = random.nextInt(11);
        numMajors = random.nextInt(11);

        General general2 = new General("General 2", 200, numPrivates, numCorporals, numCaptains, numMajors);

        System.out.println("Początkowe stany generałów:");
        System.out.println(general1);
        System.out.println(general2);

        for (int round = 1; round <= 20; round++) {
            System.out.println("\nRunda " + round);

            System.out.println("\nGenerał 1 zarządza manewrami:");
            general1.performManeuvers();

            System.out.println("\nGenerał 2 zarządza manewrami:");
            general2.performManeuvers();

            System.out.println("\nAktualne stany generałów po rundzie " + round + ":");
            System.out.println(general1);
            System.out.println(general2);

            if (round % 5 == 0) {
                System.out.println("\nWOJNA!!!");

                int general1Strength = general1.getTotalStrength();
                int general2Strength = general2.getTotalStrength();

                if (general1Strength > general2Strength) {
                    System.out.println("Generał 1 wygrywa wojnę!");
                    int goldTransfer = (int) (general2.getGold() * 0.1);
                    general2.setGold(general2.getGold() - goldTransfer);
                    general1.setGold(general1.getGold() + goldTransfer);
                } else if (general2Strength > general1Strength) {
                    System.out.println("Generał 2 wygrywa wojnę!");
                    int goldTransfer = (int) (general1.getGold() * 0.1);
                    general1.setGold(general1.getGold() - goldTransfer);
                    general2.setGold(general2.getGold() + goldTransfer);
                } else {
                    System.out.println("Remis wojny!");
                }

                System.out.println("Aktualne stany generałów po wojnie:");
                System.out.println(general1);
                System.out.println(general2);
            }
        }

        System.out.println("\nWynik końcowy:");
        System.out.println("Generał 1: " + general1.getTotalStrength());
        System.out.println("Generał 2: " + general2.getTotalStrength());

        if (general1.getTotalStrength() > general2.getTotalStrength()) {
            System.out.println("Generał 1 wygrywa!");
        } else if (general2.getTotalStrength() > general1.getTotalStrength()) {
            System.out.println("Generał 2 wygrywa!");
        } else {
            System.out.println("Remis!");
        }

        System.out.println("\nAktualne stany generałów po walce:");
        System.out.println(general1);
        System.out.println(general2);
    }
}

enum SoldierRank {
    PRIVATE(1),
    CORPORAL(2),
    CAPTAIN(3),
    MAJOR(4);

    private final int value;

    SoldierRank(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

class Soldier {
    private String name;
    private SoldierRank rank;
    private int experience;

    public Soldier(String name, SoldierRank rank, int experience) {
        this.name = name;
        this.rank = rank;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public SoldierRank getRank() {
        return rank;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;

        if (experience % rank.getValue() == 0) {
            promote();
        }
    }

    public int getStrength() {
        return rank.getValue() * experience;
    }

    public void promote() {
        if (rank == SoldierRank.MAJOR) {
            return;
        }

        rank = SoldierRank.values()[rank.ordinal() + 1];
        experience = 1;
    }

    @Override
    public String toString() {
        return name + ": " + rank + ", doświadczenie: " + experience + ", siła: " + getStrength();
    }
}

class General {
    private String name;
    private int gold;
    private int numPrivates;
    private int numCorporals;
    private int numCaptains;
    private int numMajors;
    private Soldier[] soldiers;

    public General(String name, int gold, int numPrivates, int numCorporals, int numCaptains, int numMajors) {
        this.name = name;
        this.gold = gold;
        this.numPrivates = numPrivates;
        this.numCorporals = numCorporals;
        this.numCaptains = numCaptains;
        this.numMajors = numMajors;
        initializeSoldiers();
    }

    private void initializeSoldiers() {
        int totalSoldiers = numPrivates + numCorporals + numCaptains + numMajors;
        soldiers = new Soldier[totalSoldiers];

        int index = 0;
        for (int i = 0; i < numPrivates; i++) {
            soldiers[index++] = new Soldier("Szeregowy " + (i + 1), SoldierRank.PRIVATE, 1);
        }

        for (int i = 0; i < numCorporals; i++) {
            soldiers[index++] = new Soldier("Kapral " + (i + 1), SoldierRank.CORPORAL, 1);
        }

        for (int i = 0; i < numCaptains; i++) {
            soldiers[index++] = new Soldier("Kapitan " + (i + 1), SoldierRank.CAPTAIN, 1);
        }

        for (int i = 0; i < numMajors; i++) {
            soldiers[index++] = new Soldier("Major " + (i + 1), SoldierRank.MAJOR, 1);
        }
    }

    public Soldier getRandomSoldier() {
        Random random = new Random();
        int randomIndex = random.nextInt(soldiers.length);
        return soldiers[randomIndex];
    }

    public int getTotalStrength() {
        int totalStrength = 0;
        for (Soldier soldier : soldiers) {
            totalStrength += soldier.getStrength();
        }
        return totalStrength;
    }

    public void performManeuvers() {
        for (Soldier soldier : soldiers) {
            soldier.setExperience(soldier.getExperience() + 1);
        }
    }

    public String getName() {
        return name;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    @Override
    public String toString() {
        return name + ": " + gold + " złota, szeregowi: " + numPrivates + ", kaprale: " + numCorporals +
                ", kapitanowie: " + numCaptains + ", majorowie: " + numMajors;
    }
}
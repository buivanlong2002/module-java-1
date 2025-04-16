import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Material[] materials = new Material[10];
        materials[0] = new CrispyFlour("F001", "Bột mì", 25000, LocalDate.of(2024, 7, 15), 10);
        materials[1] = new CrispyFlour("F002", "Bột chiên giòn", 30000, LocalDate.of(2024, 6, 20), 8);
        materials[2] = new CrispyFlour("F003", "Bột gạo", 20000, LocalDate.of(2024, 5, 10), 12);
        materials[3] = new CrispyFlour("F004", "Bột năng", 22000, LocalDate.of(2024, 8, 25), 9);
        materials[4] = new CrispyFlour("F005", "Bột bắp", 28000, LocalDate.of(2024, 7, 18), 11);

        materials[5] = new Meat("M001", "Thịt bò", 120000, LocalDate.of(2025, 4, 10), 1.2);
        materials[6] = new Meat("M002", "Thịt gà", 90000, LocalDate.of(2025, 4, 12), 1.0);
        materials[7] = new Meat("M003", "Thịt heo", 85000, LocalDate.of(2025, 4, 8), 1.5);
        materials[8] = new Meat("M004", "Thịt cừu", 150000, LocalDate.of(2025, 4, 5), 0.8);
        materials[9] = new Meat("M005", "Thịt vịt", 95000, LocalDate.of(2025, 4, 13), 1.1);

        DiscountDifference(materials);
    }

    private static void DiscountDifference(Material[] materials) {
        for(Material material : materials) {
            double discountDifference;
            if (material instanceof CrispyFlour) {
                discountDifference = material.getAmount() - ((CrispyFlour) material).getRealMoney();
                System.out.println(material + " discountDifference: " + discountDifference);
            }
            if (material instanceof Meat) {
                discountDifference = material.getAmount() - ((Meat) material).getRealMoney();
                System.out.println(material + " discountDifference: " + discountDifference);
            }
        }
    }
}
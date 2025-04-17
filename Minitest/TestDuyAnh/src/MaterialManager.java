import java.time.LocalDate;
import java.util.Scanner;

public class MaterialManager {


    public static void getDifferentCost(Material[] materials) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter name of material to get different cost (between initial cost and discounted cost): ");
        String nameMaterial = keyboard.nextLine();
        double differentCost = 0;
        for (int i = 0; i < materials.length; i++) {
            if (materials[i].getName().equals(nameMaterial)) {
                if (materials[i] instanceof CrispyFlour) {
                    differentCost = (materials[i]).getAmount() - ((CrispyFlour) materials[i]).getRealMoney();
                    break;
                } else if (materials[i] instanceof Meat) {
                    differentCost = (materials[i]).getAmount() - ((Meat) materials[i]).getRealMoney();
                    break;
                }
            }
        }
        if (differentCost != 0) {
            System.out.println("The different cost is: " + differentCost);
        } else {
            System.out.println("Invalid name of material");
        }
    }

    public static void displayMaterials(Material[] materials) {
        System.out.println("The list of all material includes details below: ");
        for (Material material : materials) {
            System.out.println(material);
        }
    }

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number of crispy flavour materials: ");
        int numberCrispyFlour = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Enter number of meat materials: ");
        int numberMeat = keyboard.nextInt();
        keyboard.nextLine();
        Material[] materials = new Material[numberCrispyFlour + numberMeat];
        for (int i = 0; i < numberCrispyFlour; i++) {
            System.out.println("Enter id of the " + i + 1 + " material (crispy flavour): ");
            String id = keyboard.nextLine();

            System.out.println("Enter name of the " + i + 1 + " material (crispy flavour): ");
            String name = keyboard.nextLine();

            System.out.println("Enter manufacturing date (yyyy-MM-dd) of the " + i + 1 + " material (crispy flavour): ");
            String date = keyboard.nextLine();
            LocalDate manufacturingDate = LocalDate.parse(date);

            System.out.println("Enter cost of the " + i + 1 + " material (crispy flavour): ");
            int cost = keyboard.nextInt();
            keyboard.nextLine();

            System.out.println("Enter quantity of the " + i + 1 + " material (crispy flavour): ");
            int quantity = keyboard.nextInt();
            keyboard.nextLine();

            materials[i] = new CrispyFlour(id, name, manufacturingDate, cost, quantity);
        }
        for (int i = 0; i < numberMeat; i++) {
            System.out.println("Enter id of the " + (i + numberCrispyFlour + 1) + " material (meat): ");
            String id = keyboard.nextLine();
            System.out.println("Enter name of the " + (i + numberCrispyFlour + 1) + " material (meat): ");
            String name = keyboard.nextLine();
            System.out.println("Enter manufacturing date (yyyy-MM-dd) of the " + (i + numberCrispyFlour + 1) + " material (meat): ");
            String date = keyboard.nextLine();
            LocalDate manufacturingDate = LocalDate.parse(date);
            System.out.println("Enter cost of the " + (i + numberCrispyFlour + 1) + " material (meat): ");
            int cost = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Enter weight of the " + (i + numberCrispyFlour + 1) + " material (meat): ");
            double weight = keyboard.nextDouble();
            keyboard.nextLine();
            materials[i + numberCrispyFlour] = new Meat(id, name, manufacturingDate, cost, weight);
        }

        int choice = -1;
        do {
            System.out.println("Option: ");
            System.out.println("1. Add the list of materials");
            System.out.println("2. Get different cost between initial cost and discounted cost of a material");
            System.out.println("0. Exit");
            choice = keyboard.nextInt();
            switch (choice) {
                case 1:
                    displayMaterials(materials);
                    break;
                case 2:
                    getDifferentCost(materials);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid option");
            }
        } while (choice != 0);

    }
}
package animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: Cuc tac, cuc tac";
    }

    @Override
    public String howToEat() {
        return "hu hu hu";
    }
}

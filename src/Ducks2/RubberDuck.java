package Ducks2;

public class RubberDuck extends Duck implements Quackable {
    @Override
    public void display() {
        System.out.println("Display RubberDuck ");
    }

    @Override
    public void quack() {
        System.out.println("RubberDuck says quack ");
    }
}

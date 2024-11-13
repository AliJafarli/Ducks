public class MallardDuck extends Duck implements Flyable,Quackable{
    @Override
    public void display() {
        System.out.println("Display MallardDuck ");
    }

    @Override
    public void fly() {
        System.out.println("MalladDuck is flying ");
    }

    @Override
    public void quack() {
        System.out.println("MalladDuck says quack ");
    }
}

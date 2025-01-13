public class RedheadDuck extends Duck implements Flyable,Quackable{
    @Override
    public void display() {
        System.out.println("Display RedheadDuck ");
    }

    @Override
    public void fly() {
        System.out.println("RedheadDuck is flying ");
    }

    @Override
    public void quack() {
        System.out.println("RedheadDuck says quack ");
    }
}

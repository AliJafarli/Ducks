package Ducks2;

public class Main {
    public static void main(String[] args) {
//        Duck duck = new Duck(); - can`t create for abstract class
        Duck duck1 = new MallardDuck();
        Duck duck2 = new DecoyDuck();
        DecoyDuck decoyDuck = new DecoyDuck();
        Flyable flyable1 = new MallardDuck();
        Flyable flyable2 = new RedheadDuck();
        Quackable quackable1 = new MallardDuck();
        Quackable quackable2 = new RedheadDuck();
        Quackable quackable3 = new RubberDuck();


//        duck.swim();
        System.out.println();
        decoyDuck.display();
        decoyDuck.swim();
        System.out.println();
        flyable1.fly();
        System.out.println();
        duck1.swim();
        duck1.display();
        System.out.println();
        quackable1.quack();
        System.out.println();
        duck2.display();
        duck2.swim();

    }
}
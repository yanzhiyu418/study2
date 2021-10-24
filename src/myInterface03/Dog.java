package myInterface03;

public class Dog  extends  Animal implements  Jumpping{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void jump() {
        System.out.println("狗可以跑");
    }

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }
}

package myInterface03;

public class Cat  extends  Animal implements  Jumpping{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void jump() {
        System.out.println("猫可以跳");
    }

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }
}

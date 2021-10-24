package myInterface05;

public class BasketballPlayer  extends  Player{
    @Override
    public void study() {
        System.out.println("篮球运动员学习");
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃牛肉");
    }

    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }
}

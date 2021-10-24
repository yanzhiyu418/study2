package myInterface05;

public class PingPangPlayer  extends  Player implements  SpeakEnglish{
    @Override
    public void study() {
        System.out.println("乒乓球运动员学习乒乓球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃羊肉");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员说英语");
    }

    public PingPangPlayer() {
    }

    public PingPangPlayer(String name, int age) {
        super(name, age);
    }
}

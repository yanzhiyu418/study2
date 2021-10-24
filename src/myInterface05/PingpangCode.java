package myInterface05;

public class PingpangCode extends  Coach implements  SpeakEnglish{
    @Override
    public void teach() {
        System.out.println("乒乓球教练教乒乓球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃牛肉");
    }

    public PingpangCode() {
    }

    public PingpangCode(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练说英语");
    }
}

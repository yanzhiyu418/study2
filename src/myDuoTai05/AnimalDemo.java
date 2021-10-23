package myDuoTai05;

public class AnimalDemo {
    public static void main(String[] args) {
        //创建猫类对象进行测试
        Animal a=new Cat();
        a.setName("加菲");
        a.setAge(4);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        a=new Cat("小猫",2);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

    }
}

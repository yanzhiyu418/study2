package myExtends09;

public class AnimaDemo {
    public static void main(String[] args) {
        //创建猫类对象并测试
        Cat c1=new Cat();
        c1.setName("Jarry");
        c1.setAge(12);
        System.out.println(c1.getName()+","+c1.getAge());
        c1.catchMouse();
        System.out.println("============");
        Cat c2=new Cat("Tom",22);
        System.out.println(c2.getName()+","+c2.getAge());
        c2.catchMouse();
        System.out.println("============");
        //创建狗类对象并测试
        Dog d1=new Dog();
        d1.setName("Pact");
        d1.setAge(11);
        System.out.println(d1.getName()+","+d1.getAge());
        d1.lookDoor();
        System.out.println("============");
        Dog d2=new Dog("morry",25);
        System.out.println(d2.getName()+","+d2.getAge());
        d2.lookDoor();

    }
}

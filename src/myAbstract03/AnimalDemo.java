package myAbstract03;

public class AnimalDemo {
    public static void main(String[] args) {
        //创建对象，按照多态的方式
        Animal a=new Cat();
        a.setName("加菲猫");
        a.setAge(2);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        System.out.println("==========");
        a=new Cat("Tom",5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        System.out.println("==========");
        Animal d=new Dog();
        d.setName("Jarry");
        d.setAge(4);
        System.out.println(d.getName()+","+d.getAge());
        d.eat();
        System.out.println("==========");
        d=new Dog("mike",33);
        System.out.println(d.getName()+","+d.getAge());
        d.eat();
    }
}

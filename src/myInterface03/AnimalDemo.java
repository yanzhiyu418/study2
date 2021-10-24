package myInterface03;

public class AnimalDemo {
    public static void main(String[] args) {
        Jumpping j=new Cat();
        j.jump();
        System.out.println("-----------");
        Animal a=new Cat();
        a.setName("Tom");
        a.setAge(11);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        ((Cat) a).jump();
        System.out.println("-----------");
        a=new Cat("Jarry",33);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        System.out.println("-----------");
        Cat c=new Cat();
        c.setName("Mike");
        c.setAge(14);
        System.out.println(a.getName()+","+a.getAge());
        c.eat();
        c.jump();
        System.out.println("-----------");
        Jumpping d=new Dog();
        d.jump();
        System.out.println("-----------");
        Animal d1=new Dog();
        d1.setName("搜狗");
        d1.setAge(13);
        System.out.println(d1.getName()+","+d1.getAge());
        d1.eat();
        System.out.println("-----------");
        d1=new Dog("TIM",22);
        System.out.println(d1.getName()+","+d1.getAge());
        d1.eat();
        System.out.println("-----------");
        Dog d2=new Dog();
        d2.setName("JJ");
        d2.setAge(21);
        System.out.println(d2.getName()+","+d2.getAge());
        d2.jump();
        d2.eat();
    }
}

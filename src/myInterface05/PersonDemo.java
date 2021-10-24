package myInterface05;

public class PersonDemo {
    public static void main(String[] args) {
        PingPangPlayer pp=new PingPangPlayer();
        pp.setName("小王");
        pp.setAge(15);
        System.out.println(pp.getName()+","+pp.getAge());
        pp.eat();
        pp.speak();
        pp.study();
        System.out.println("====================");
        pp=new PingPangPlayer("张三",23);
        System.out.println(pp.getName()+","+pp.getAge());
        pp.speak();
        pp.eat();
        pp.study();
        System.out.println("====================");
        BasketballPlayer bp=new BasketballPlayer();
        bp.setName("姚明");
        bp.setAge(13);
        System.out.println(bp.getName()+","+bp.getAge());
        bp.eat();
        bp.study();
        System.out.println("====================");
        bp=new BasketballPlayer("姚明",22);
        System.out.println(bp.getName()+","+bp.getAge());
        bp.eat();
        bp.study();
        System.out.println("====================");
        PingpangCode pc=new PingpangCode();
        pc.setName("小李");
        pc.setAge(22);
        System.out.println(pc.getName()+","+pc.getAge());
        pc.eat();
        pc.speak();
        pc.teach();
    }
}

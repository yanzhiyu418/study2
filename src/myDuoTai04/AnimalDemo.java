package myDuoTai04;
/*
                    向上转型
                                    从子到父
                                    父类引用指向子类对象
                    向下转型
                                    从子到父
                                    父类引用转为子类对象
*/

public class AnimalDemo {
    public static void main(String[] args) {
        //多态
        Animal a=new Cat();//向上转型
        a.eat();
        System.out.println("=================");
        //创建Cat类的对象
        Cat c=new Cat();
        c.eat();
        c.playGame();
        System.out.println("=================");
        //向下转型
        Cat d=(Cat) a;
        d.eat();
        d.playGame();

    }
}

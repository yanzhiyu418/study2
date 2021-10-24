package myAbstract02;

/*
抽象类
*/
public  abstract class Animal {
    private  int age=20;
    private  final String animal="猫";

//构造方法
    public  Animal(){}
    public  Animal(int age){
        this.age=age;
    }
    public  void  show(){
        age=2;
        System.out.println(age);
        //animal="狗";
        System.out.println(animal);
    }
public  abstract  void eat();
}

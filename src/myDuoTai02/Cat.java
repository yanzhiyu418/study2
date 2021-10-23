package myDuoTai02;

public class Cat  extends  Animal{
    public  int age=22;
    public  int weight=10;

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public  void  playGame(){
        System.out.println("猫捉迷藏");
    }
}

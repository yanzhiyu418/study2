package myInnerClass02;

public class Outer {
    private  int num=10;
    private  int num2=20;
    public  class  Inner{
        public  void  show(){
            System.out.println(num);
        }

    }
    private  class  Inner2{
        public  void  show2(){
            System.out.println(num2);
        }
    }
    public  void  method(){
        Inner2 i=new Inner2();
        i.show2();
    }
}

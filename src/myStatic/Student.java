package myStatic;

public class Student {
    public  String name;
    public  int age;
   // public  String univaersity;
    //被所有对象共享
   public static String univaersity;
    public  void  show(){
        System.out.println(name+","+age+","+univaersity);
    }
}

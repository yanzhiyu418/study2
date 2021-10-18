package MyClass06;

public class Student<name> {

    private String name;
    private  int age;

    public Student() {
        System.out.println("111");
    }
    //构造方法
   /*
   public  Student(){
        System.out.println("无参构造方法！");
    }
    */

    public  Student(String name){
        this.name=name;
    }
    public  Student(int age){
        this.age=age;
    }
    public  Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public  String getName(){
        return  name;
    }
    public  int getAge(){
        return  age;
    }
    public  void  Show(){
        System.out.println(name+","+age);

    }
}

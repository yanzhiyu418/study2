package MyClass03;
/*
        学生类
 */

public class Student {
    //成员变量
    String   name;
    private  int age;
//get/set方法


 public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public  void  Show(){

        System.out.println(name+""+age);
    }
}

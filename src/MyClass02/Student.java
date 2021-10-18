package MyClass02;
/*

学生类

*/
public class Student{
    //成员变量
    String   name;
    private  int age;
    //提供get/set方法用于获取和设置值

    public void setAge(int a) {
                //age = a;
                                            if (a<0||a>100){
                                                System.out.println("你输入的数据有误！！");
                                            }else {
                                                            age=a;
        }
    }

    public int getAge() {
                return age;
    }
    //成员方法

    public  void  Show(){

                                            System.out.println(name+""+age);
    }

}

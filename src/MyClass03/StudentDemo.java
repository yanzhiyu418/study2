package MyClass03;
import  MyClass03.StudentDemo;
/*
学生测试类
*/

public class StudentDemo {
    public static void main(String[] args) {
                    //创建对象
                                           Student s=new Student();
                    //使用set方法获取成员变量的赋值
                                            s.setName("小明");
                                            s.setAge(24);
                                            s.Show();
                     //用get方法获取成员变量的赋值
                                             System.out.println(s.getName()+"----------"+s.getAge());
    }

}

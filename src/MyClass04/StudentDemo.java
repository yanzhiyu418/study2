package MyClass04;
import  MyClass04.StudentDemo;
/*
学生测试类
*/
import MyClass03.Student;

public class StudentDemo {
    public static void main(String[] args) {
                                //创建对象
                                MyClass03.Student s=new Student();
                                //使用set方法获取成员变量的赋值
                                s.setName("小明");
                                s.setAge(24);
                                s.Show();
    }


}

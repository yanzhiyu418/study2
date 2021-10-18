package MyClass02;//学生测试类
import MyClass02.Student;


public class StudentDemo{
    public static void main(String[] args) {
        //创建对象
                                 Student s = new Student();
        //给成员赋值
                                s.name = "小明";
        //  s.age= 14;

                                s.setAge(-30);
                                s.setAge(30);
        //调用show方法
                                s.Show();

    }
    }
package MyClass06;

import MyClass06.Student;

public class StudentDemo {
    public static void main(String[] args) {
                                //创建对象
                               Student s1=new Student();
                               s1.Show();
                                //   public Student(String name)
                                Student s2=new Student("小明");
                                s2.Show();
                                //public  Student(int age)
                                Student s3=new Student(34);
                                s3.Show();
                                //  public  Student(String name,int age)
                                Student s4=new Student("小王",24);
                                s4.Show();

    }
    }


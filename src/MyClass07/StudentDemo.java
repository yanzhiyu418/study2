package MyClass07;
/*

                            创建对象并为其成员变量赋值的两种方法
                                                    1.无参构造方法创建对象侯使用setXxx()赋值
                                                    2.使用带参构造方法直接创建带有属性值的对象
                        */

public class StudentDemo {
    public static void main(String[] args) {
//        无参构造方法创建对象侯使用setXxx()赋值
                                                Student s1=new Student();
                                                s1.setName("小明");
                                                s1.setAge(23);
                                                s1.Show();
//        使用带参构造方法直接创建带有属性值的对象
                                                Student s2=new Student("小王",24);
                                                s2.Show();
        }
}

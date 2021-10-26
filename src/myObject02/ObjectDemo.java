package myObject02;
/*

测试类
public boolean equals(Object obj)指示一些其它对象是否等于此
*/

import myObject.Student;

public class ObjectDemo {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("张三");
        s1.setAge(12);


        Student s2=new Student();
        s2.setName("张三");
        s2.setAge(12);

        System.out.println(s1.equals(s2));
    /*
public boolean equals(Object obj) {
                this---s1
                obj---s2
            return this == obj;
        }
*/

    }
}

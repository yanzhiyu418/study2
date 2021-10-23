package myStatic;

public class StaticDemo {
    public static void main(String[] args) {
        Student.univaersity="北京大学";




        Student s1=new Student();
        s1.name="张三";
        s1.age=22;
    //    s1.univaersity="北京大学";
        s1.show();
        Student s2=new Student();
        s2.name="李四";
        s2.age=21;
       // s2.univaersity="清华大学";
        s2.show();
    }
}

package MyClass;

public class StudentTest03 {
    public static void main(String[] args) {
                           //创建第一个对象并使用
                                            Student s1=new Student();
                                            s1.student="林青霞";
                                            s1.age=28;
                                            System.out.println(s1.student+","+s1.age);
                         //把第一个对象的地址赋值给第二个对象
                                            Student s2=s1;
                                            s2.student="小王";
                                            s2.age=24;
                                            System.out.println(s1.student+","+s1.age);
                                            System.out.println(s2.student+","+s2.age);

    }
}

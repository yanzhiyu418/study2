package MyClass;

//学生测试类


public class StudentDemo {
    public static void main(String[] args) {
                         //创建对象
                                        Student s=new Student();
                                         System.out.println(s);
                         //使用对象
                                        System.out.println(s.student);
                                        System.out.println(s.age);
                                        s.student="小明";
                                        s.age=14;
                                        System.out.println(s.student);
                                        System.out.println(s.age);

                                        s.doHomeWork();
                                        s.Study();
    }
}

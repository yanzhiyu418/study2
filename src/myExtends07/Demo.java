package myExtends07;

public class Demo {
    public static void main(String[] args) {
        //创建老师类进行测试
        Teacher t1=new Teacher();
        t1.setName("张三");
        t1.setAge(24);
        System.out.println(t1.getName()+","+t1.getAge());
        t1.teacher();

        Teacher t2=new Teacher("李四",25);
        System.out.println(t2.getName()+","+t2.getAge());
        t2.teacher();
        //创建学生类进行测试
        System.out.println("===================");
        Student s1=new Student();
        s1.setName("小明");
        s1.setAge(12);
        System.out.println(s1.getName()+","+s1.getAge());
        s1.study();

        Student s2=new Student("小红",14);
        System.out.println(s2.getName()+","+s2.getAge());
        s2.study();


    }
}

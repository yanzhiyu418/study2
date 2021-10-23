package myExtends08;
/*测试类*/
public class PersonDemo {
    public static void main(String[] args) {
        //创建老师类对象并测试
        Teacher t1=new Teacher();
        t1.setName("张三");
        t1.setAge(35);
        System.out.println(t1.getName()+","+t1.getAge());
        t1.teach();
        System.out.println("===========");

        Teacher t2=new Teacher("李四",44);
        System.out.println(t2.getName()+","+t2.getAge());
        t2.teach();
    }
}

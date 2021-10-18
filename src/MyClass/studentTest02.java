package MyClass;
/*
                    多个对象指向相同时
*/

public class studentTest02 {
    public static void main(String[] args) {
        //创建第一个对象并使用
                                    Student s1=new Student();
                                    s1.student="林青霞";
                                    s1.age=28;
                                    System.out.println(s1.student+","+s1.age);
                                    s1.doHomeWork();
                                    s1.Study();

     //创建第二个对象并使用
                                    Student s2=new Student();
                                    s2.student="小明";
                                    s2.age=22;
                                    System.out.println(s2.student+","+s2.age);
                                    s2.doHomeWork();
                                    s2.Study();

    }
}

package myObject02;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        //比较地址是否相同，如果相同直接返回true
        /*this----s1
            o------s2*/
        if (this == o) return true;
        //判断对象是否为null，判断两个对象是否来自同一个类
        if (o == null || getClass() != o.getClass())
            return false;
        //向下转型
        Student student = (Student) o;
        //比较年龄是否相同

        if (age != student.age)
            return false;
        //比较姓名是否相同
       // return name != null ? name.equals(student.name) : student.name == null;
        return  name!=null?name.equals(student.name):student.name==null;
    }

}
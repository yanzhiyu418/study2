package myObject;
/*

Object 是类层次结构的根，每个类都可以将object作为超类，所有类都直接或者间接的继承自该类
看方法的源码，选中方法，按下Ctrl+B
*/

import java.io.PrintStream;

public class ObjectdDemo {
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("张三");
        s.setAge(22);
        System.out.println(s);//myObject.Student@4eec7777
        System.out.println(s.toString());
/*
        public void println(Object x) {
            String s = String.valueOf(x);
            if (this.getClass() == PrintStream.class) {
                this.writeln(String.valueOf(s));
            } else {
                synchronized(this) {
                    this.print(s);
                    this.newLine();
                }
                */
    }
}

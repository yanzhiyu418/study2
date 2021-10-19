package myArrayList;
/*

ArrayList 构造方法：
public ArrayList();创建一个空的集合对象
ArrayListt添加方法：
public boolean add(E e),将指定的元素追加到此集合的末尾
public void add（int index,E element）;在此集合中的指定位置插入指定的元素
*/

import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {
                                //public ArrayList();创建一个空的集合对象
                                                ArrayList<String> array=new ArrayList<>();

                            //public boolean add(E e),将指定的元素追加到此集合的末尾
                           //方法1：
                            // System.out.println("hello");
                                                array.add("hello");
                                                array.add("world");
                                                array.add("java");
                         //public void add（int index,E element）;在此集合中的指定位置插入指定的元素
                                                array.add(1,"javaee");
                                                array.add(3,"javac");
                            //.IndexOutOfBoundsException数组越界
                           //array.add(8,"yuejie");

                            //输出集合
                                              System.out.println("array:"+array);

    }
}


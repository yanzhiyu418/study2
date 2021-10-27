package myInteger03;
/*
int 和String的相互转换
*/

public class IntegerDemo {
    public static void main(String[] args) {
        //int---String
        int number=100;
        //方法一
        String s1=""+number;
        System.out.println(s1);
        //方法二
        String s2=String.valueOf(number);
        System.out.println(s2);
        System.out.println("---------------");
        //String----int
        String s="100";
        //方法1
        //string----Integer----int
        Integer i=Integer.valueOf(s);
        //public int intValue()
        int x=i.intValue();
        System.out.println(x);
        //方法二
        //public static int parseInt(String s)
        int y=Integer.parseInt(s);
        System.out.println(y);
    }
}

package myStringBuilder;
/*
                            StringBuilder构造方法：
                                                    public StringBuilder(),创建一个空白可变字符串对象，不含有任何内容
                                                    public StringBuilder(String str),根据字符串的内容，来创建可变字符串对象
*/

public class StringBuilderDermo01 {
    public static void main(String[] args) {
        //public StringBuilder(),创建一个空白可变字符串对象，不含有任何内容
        StringBuilder sb=new StringBuilder();
        System.out.println("sb:"+sb);
        System.out.println("sb.length:"+sb.length());
        System.out.println("==============================");
        //public StringBuilder(String str),根据字符串的内容，来创建可变字符串对象
        StringBuilder sb2=new StringBuilder("helloworld");
        System.out.println("sb2:"+sb2);
        System.out.println("sb2.length:"+sb2.length());
    }
}

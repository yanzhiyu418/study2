package myStringBuilder;
/*
                        StringBuilder 转换为String
                                        public String toString(),通过toString()就可以实现把StringBuilder转换为String

                        String转换为StringBuilder
                                         public StringBuilder(String s),通过构造方法就可以实现把String转换为StringBuilder
*/

public class StringBuilderDemo03 {
    public static void main(String[] args) {
                                //  StringBuilder 转换为String
                                                StringBuilder sb=new StringBuilder();
                                                sb.append("hello");
                                //    public String toString(),通过toString()
                                                String s=sb.toString();
                                                System.out.println(s);
                                //  String转换为StringBuilder
                                                String s2="world";
                                // public StringBuilder(String s),
                                                StringBuilder sb2=new StringBuilder(s2);
                                                System.out.println(sb2);

    }
}

package MyMethod;

/*          需求：
                         使用方法重载的思想，设计比较两个整数是否相同的方法，兼容全整数类型（byte,short,int,long）
          思路：
                      1.定义比较两个数字是否相同的方法compare()方法，参数选择两个int型参数
                      2.定义对应的重载方法，变更对应的参数类型，参数变更为两个long型参数
                      3.定义所有的重载方法，两个byte类型与两个short类型参数
                      4.完成方法的调用，测试运行结果
*/
public class  MethodDemo5 {
      public static void main(String[] args) {
          System.out.println(compare(10,120));
          System.out.println(compare((byte)10,(byte)120));
          System.out.println(compare((short) 10,(short) 120));
          System.out.println(compare(10L,120L));

      }
      //int类型
      public  static  boolean compare(int a ,int b){
          System.out.println("int");
          return  a==b;
      }
      //byte类型
      public  static  boolean compare(byte a ,byte b){
          System.out.println("bytes");
          return  a==b;
      }
      //short类型
      public  static  boolean compare(short a ,short b){
          System.out.println("short");
          return  a==b;
      }
      //long类型
      public  static  boolean compare(long a ,long b){
          System.out.println("long");
          return  a==b;
      }
}

package myInteger03;
/*

需求：
有一个字符串：“91 27 46 38 50”，请写程序实现最终输出结果是“27 38 46 50 91”
思路：
1.定义一个字符串
2.吧字符串中的数字数据存储到一个int类型的数组中
得到字符串中的每一个数字数据
public Stringp[]split(String regex)
定义一个int数组，把String【】数组中的每一个元素存储到int数组中
public static int parseInt(String s)
3.对int数组进行排序
4.把排序侯的int数组中的元素进行拼接得到一个字符串，这里拼接采用StringBuilder来实现
5.输出结果

*/

import java.util.Arrays;

public class IntegerTest {
    public static void main(String[] args) {
        //定义一个字符串
        String s="91 27 46 38 50";

        //把字符串中的数字数据存储到一个int类型的数组中
        String[]strArray=s.split(" ");
/*        for (int i=0;i<strArray.length;i++){
            System.out.println(strArray[i]);
        }*/
        int []arr=new  int[strArray.length];
        for (int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(strArray[i]);

        }
        //对int数组进行排序
        Arrays.sort(arr);
        //排序侯的int数组中的元素进行拼接得到一个字符串
        StringBuilder sb=new StringBuilder();
        for (int i=0;i< arr.length;i++){
            if (i== arr.length-1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]).append(" ");
            }
        }
        String result=sb.toString();
        System.out.println("result:"+result);
    }
}

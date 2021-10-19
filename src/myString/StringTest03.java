package myString;
/*
                                        需求：
                                                        键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数（不考虑其它字符）
                                        思路：
                                                        1.键盘录入一个字符串，用Scanner实现
                                                        2.要统计三种类型的字符个数，需定义三个统计变量，初始值都为0
                                                        3.遍历字符串，得到每一个字符
                                                        4.判断该字符属于那种类型，然后对应类型的统计变量+1
                                                        假如ch是一个字符，我要判断他属于大写字母，小写字母，还是数字，直接判断该字符是否在对应的范围即可
                                                        大写字母：ch>='A'&&ch<='Z'
                                                        小写字母：ch>'a'&&ch<='z'
                                                        数字：ch>='0'&&ch<='9'
                                                        5.输出三仲类型的字符个数
*/


import java.util.Scanner;

public class StringTest03 {
    public static void main(String[] args) {
        //键盘录入一个字符串，用Scanner实现
                                        Scanner sc=new Scanner(System.in);
                                        System.out.println("请输入一串字符串：");
                                        String Line= sc.nextLine();
        //要统计三种类型的字符个数，需定义三个统计变量，初始值都为0
                                        int bigCount=0;
                                        int smallCount=0;
                                        int number=0;
                                        for (int i=0;i<Line.length();i++){
                                        char ch=Line.charAt(i);
            //判断该字符属于那种类型，然后对应类型的统计变量+1
                                        if (ch>='A'&&ch<='Z'){
                                            bigCount++;
                                        }else if(ch>='a'&&ch<='z'){
                                            smallCount++;

                                        }else  if(ch>='0'&&ch<='9'){
                                            number++;
            }
        }
                                    System.out.println("大写字母个数是："+bigCount+"个");
                                    System.out.println("小写字母个数是："+smallCount+"个");
                                    System.out.println("数字个数是："+number+"个");
                                }
}

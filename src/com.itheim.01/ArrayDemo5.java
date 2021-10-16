/*获取最值*/
public class ArrayDemo5 {
    public static void main(String[] args) {
        //定义数组
        int[]arr={11,42,2,53,254,35};
        //定义一个变量，用于保存最大值
        //数组的第一个值用于作为变量的初始值
        int max=arr[0];
        int min=arr[0];
        //与数组中的值逐个对比，将最大的值保存在数组中
        for (int x=0;x< arr.length;x++){
          if(arr[x]>max){
              max=arr[x];
          }
          if(arr[x]<min){
                min=arr[x];
            }

        }
        //循环结束打印最大值,最小值
        System.out.println("max:"+max);
        System.out.println("min:"+min);
    }


}

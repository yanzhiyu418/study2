package myExtends05;

/*
测试类*/

public class PhoneDemo {
    public static void main(String[] args) {
        //创建对象，调用方法
        Phone p=new Phone();
        p.call("张三");
        System.out.println("===============");

        newPhone np=new newPhone();
        np.call("李四");
    }
}

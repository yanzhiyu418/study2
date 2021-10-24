package myInterface02;

//public class Interlmpl {
public  class Interlmpl  extends  Object implements  Inter {
public  Interlmpl(){
    super();
}

    @Override
    public void method() {
        System.out.println("method");
    }

    @Override
    public void show() {
        System.out.println("show");
    }
}

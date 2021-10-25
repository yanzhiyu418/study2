package myInnerClass05;

public class JumppingDemo {
    public static void main(String[] args) {
        JumppingOperator jo = new JumppingOperator();

        Jummping j = new Cat();
        jo.method(j);

        Jummping j2 = new Dog();
        jo.method(j2);

        System.out.println("====================");
        jo.method(new Jummping() {
            @Override
            public void jump() {
                System.out.println("猫跳高");
            }
        });
        jo.method(new Jummping() {
            @Override
            public void jump() {
                System.out.println("狗跳高");
            }
        });
    }
}

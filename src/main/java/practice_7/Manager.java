package practice_7;

interface Operation{
    int perform(int a, int b);
}

class MyMath{
    public int calculate(int a, int b, Operation operation){
        return operation.perform(a,b);
    }
}
public class Manager {

    public static void main(String[] args) {
        MyMath m1 = new MyMath();
        int a = 10, b = 20;
        int add = m1.calculate(a, b, new Operation() {
            @Override
            public int perform(int a, int b) {
                return a+b;
            }
        });

        System.out.println(add);
    }






}

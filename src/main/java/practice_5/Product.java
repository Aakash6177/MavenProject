package practice_5;

public class Product {

    String name;
    String code;
    int productID;
    double quantity;

    // this overloading of the constructor

    public Product(){

    }
    public Product(String name, String code, int productID){
        this(name, code, 0.0, productID);

    }

    public Product(String name, String code, double quantity, int productID){
        this.name = name;
        this.code = code;
        this.quantity = quantity;
        this.productID = productID;

    }

    public void printNames(String... names){
        for(String ele:names){
            System.out.println(ele);
        }
    }



    public static void main(String[] args) {

        Product obj1 = new Product();
        obj1.printNames("Aakash","Sharma","Hello","AMana", "Lilly", "Diana", "Daniel","Alex", "Grant", "Mikayla");

    }
}

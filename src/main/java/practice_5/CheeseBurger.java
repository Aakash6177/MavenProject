package practice_5;

public class CheeseBurger extends Burger {
    private boolean isMayo;
    private boolean isMusturd;

    public CheeseBurger(){
        this.setKetchup(true);
        this.setCheeseQuantity(2);
        this.setLettuceQuantity(1);
        this.setTomatoeQuantity(3);
        this.setNumBuns(2);
        this.setPattyQuantity(2);
        this.isMayo = true;
        this.isMusturd = true;

    }

    public void showDetails(){
        System.out.println("Cheese slices: "+this.getCheeseQuantity());
        System.out.println("Lettuce: "+this.getLettuceQuantity());
        System.out.println("Buns: "+this.getNumBuns());
        System.out.println("Ketchup: "+this.isKetchup());
        System.out.println("Mayo: "+this.isMayo);
        System.out.println("Musturd: "+this.isMusturd);
        System.out.println("Patties: "+this.getPattyQuantity());
        System.out.println("Tomatoes: "+this.getTomatoeQuantity());
    }
}

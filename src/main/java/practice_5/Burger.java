package practice_5;

public class Burger {
    private int pattyQuantity;
    private int cheeseQuantity;
    private int lettuceQuantity;
    private int tomatoeQuantity;
    private boolean isKetchup;
    private int numBuns;

    public boolean isKetchup() {
        return isKetchup;
    }

    public void setKetchup(boolean ketchup) {
        isKetchup = ketchup;
    }

    public Burger(){
        this.numBuns = 2;
        this.tomatoeQuantity = 0;
        this.lettuceQuantity = 0;
        this.cheeseQuantity = 0;
        this.isKetchup = true;
        this.pattyQuantity = 1;
    }
    public int getPattyQuantity() {
        return pattyQuantity;
    }

    public void setPattyQuantity(int pattyQuantity) {
        this.pattyQuantity = pattyQuantity;
    }

    public int getCheeseQuantity() {
        return cheeseQuantity;
    }

    public void setCheeseQuantity(int cheeseQuantity) {
        this.cheeseQuantity = cheeseQuantity;
    }

    public int getLettuceQuantity() {
        return lettuceQuantity;
    }

    public void setLettuceQuantity(int lettuceQuantity) {
        this.lettuceQuantity = lettuceQuantity;
    }

    public int getTomatoeQuantity() {
        return tomatoeQuantity;
    }

    public void setTomatoeQuantity(int tomatoeQuantity) {
        this.tomatoeQuantity = tomatoeQuantity;
    }

    public int getNumBuns() {
        return numBuns;
    }

    public void setNumBuns(int numBuns) {
        this.numBuns = numBuns;
    }

    public void showDetails(){

        System.out.println("Cheese "+this.cheeseQuantity);
        System.out.println("Ketchup "+this.isKetchup);
        System.out.println("Buns" +this.numBuns);
        System.out.println("Lettuce "+this.lettuceQuantity);
        System.out.println("Tomatoes "+this.tomatoeQuantity);
        System.out.println("Patty Count "+this.pattyQuantity);
    }
}

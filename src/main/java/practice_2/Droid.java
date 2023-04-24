package practice_2;

public class Droid{

    String name;
    int batteryLevel;

    public Droid(String droidName){
        name = droidName;
        batteryLevel = 100;
    }

    public String toString(){
        return "Hello, I am the droid: "+this.name;
    }

    public void performTask(String task){
        System.out.println(this.name+" is performing task: "+task);
        this.batteryLevel -= 10;
    }



    public static void main(String[] args){
        Droid d1 = new Droid("Codey");
        System.out.println(d1);
        d1.toString();
        d1.performTask("Dancing");
        System.out.println(d1.batteryLevel);
    }

}
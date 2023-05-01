package practice_4;

import javax.imageio.IIOException;
import java.util.Scanner;
import java.util.ArrayList;
public class ReadTextFile {

    public static void main(String[] args) throws IIOException {
        ArrayList<String> students = new ArrayList<String>();


        students.add("Sade");
        students.add("Alexus");
        students.add("Sam");
        students.add("Koma");

        for(String ele: students){
            System.out.println(ele);
        }


    }
}

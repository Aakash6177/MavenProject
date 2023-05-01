package practice_4;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {


        List<Integer> list1 = new java.util.ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);

        List<Integer> list2 = new java.util.ArrayList<>();
        list2.add(40);
        list2.add(20);
        list2.add(50);

        List<Integer> list = new java.util.ArrayList<>();
        list.addAll(list1);
        list.addAll(list2);

        System.out.println(list);
        System.out.println(list.contains(30));
        System.out.println(list.containsAll(list1));

        String a = "a";
        System.out.println(a);

    }


}

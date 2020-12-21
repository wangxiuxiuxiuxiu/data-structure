package array;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList <Integer>list  = new ArrayList<Integer>();
        list.add(2);
        ArrayList list2  = new ArrayList();
        list2.add(2);
        list.remove(0);
        String S = list2.get(0).toString();
        int newCapacity = 10 + (10 >> 1);
        System.out.println(newCapacity+"--"+list.toString());
    }
}

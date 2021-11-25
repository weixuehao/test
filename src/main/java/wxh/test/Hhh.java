package wxh.test;

import java.util.ArrayList;
import java.util.List;

public class Hhh {
    public static void main(String[] args) {
        String[] a = {"a","b","c","d"};
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(list.get(0));
        System.out.println(list.get(-1));
        System.out.println(list.get(list.size()-1));



    }
}

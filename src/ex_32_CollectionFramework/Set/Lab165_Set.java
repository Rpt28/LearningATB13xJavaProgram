package ex_32_CollectionFramework.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab165_Set {
    public static void main(String[] args) {
        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts  = new TreeSet();


        hs.add("Pramod");
        hs.add("Pramod");
        hs.add("Dutta");
        System.out.println(hs);




    }
}

package _12_Java_Collection_Framework.practice.th1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer , String> hashMap = new HashMap<>();
        hashMap.put(36, "Tom");
        hashMap.put(37, "Tony");
        hashMap.put(38, "Jim");
        hashMap.put(39, "Mike");
        System.out.println("Display list :");
        System.out.println(hashMap + "\n");
        Map<Integer , String> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        Map<Integer , String> linkedHashMap = new LinkedHashMap<>(16, 0.75f ,true);
        linkedHashMap.put(36,"Tom");
        linkedHashMap.put(37,"Tom");
        linkedHashMap.put(38,"Tom");
        linkedHashMap.put(39,"Tom");
        linkedHashMap.put(40,"Tom");
        System.out.println(linkedHashMap.get(36));
    }
}

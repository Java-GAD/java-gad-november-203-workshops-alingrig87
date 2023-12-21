package org.example.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exemple {
    public static void main(String args[]) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Costel");
        names.add("Ionel");
        names.add("Daniel");

        names.set(1, "Marcel");
        names.remove(1);

        for(String name: names) {
            System.out.println(name);
        }

        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 3);
        map.put("d", 5);

        System.out.println(map.get("d"));

        for(Map.Entry<String, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}

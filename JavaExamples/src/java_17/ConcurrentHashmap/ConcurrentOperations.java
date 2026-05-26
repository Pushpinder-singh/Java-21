package java_17.ConcurrentHashmap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentOperations {
    public static void main(String[] args) {

        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        map.put("A", 1);
        map.put("B", 2);

        map.putIfAbsent("B", 10); // won't add this value- no duplicate, avoids race condition

        map.replace("B", 100); // Replace value if key exists

        // CAS style - COmpare and swap
        map.replace("B", 50, 200); // replace only of old value is 50 else no replacement
        // System.out.println("Map::" + map.entrySet());

        // Atomic Aggregations
        map.compute("A", (key, val) -> val == null ? 1 : val + 1);
        map.computeIfAbsent("C", k -> k.length()); // key is absent than calculate for c
        map.computeIfPresent("C", (k, v) -> v * 2); // now C is present so calculates
        // System.out.println("Map::" + map.entrySet());

        // Bulk parallel operations
        map.forEach(1, (k, v) -> {
            System.out.println(Thread.currentThread().getName());
        });

        String result = map.search(1, (k, v) -> {
            if (v == 100)
                return k;
            return null;
        });

        System.out.println("result : " + result);

        int sum = map.reduce(1,
                (k, v) -> v,
                Integer::sum);
        System.out.println("sum : " + sum);

    }

}

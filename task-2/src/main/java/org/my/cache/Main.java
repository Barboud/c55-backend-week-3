package org.my.cache;

public class Main {
    public static void main(String[] args) {
        Cache<String> stringCache = new Cache<String>();
        stringCache.put("name", "HackYourFuture");
        System.out.println(stringCache.get("name")); // -> "HackYourFuture"
        System.out.println(stringCache.get("city")); // -> null

        Cache<Integer> numberCache = new Cache<Integer>();
        numberCache.put("c1", 12345);
        numberCache.put("c2", 54321);
        numberCache.put("c3", 54321);
        System.out.println(numberCache.size()); // -> 2
        numberCache.remove("c1");
        System.out.println(numberCache.get("c1")); // -> null
    }
}
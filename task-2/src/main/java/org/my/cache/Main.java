package org.my.cache;

public class Main {
    public static void main(String[] args) {
        Cache<String> stringCache = new Cache<String>();
        stringCache.put("name", "HackYourFuture");
        System.out.println(stringCache.get("name")); // -> "HackYourFuture"
        System.out.println(stringCache.get("city")); // -> null

        Cache<Double> numberCache = new Cache<Double>();
        numberCache.put("c1", 15.25);
        numberCache.put("c2", 20.25);
        numberCache.put("c3", 31.77);
        System.out.println(numberCache.size()); // -> 3
        System.out.println(numberCache.get("c1")); // -> 15.25
        numberCache.remove("c1");
        System.out.println(numberCache.get("c1")); // -> null
    }
}
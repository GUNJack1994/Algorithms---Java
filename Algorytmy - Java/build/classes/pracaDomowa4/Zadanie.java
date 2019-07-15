
package kolekcje.zajecia8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;


public class Zadanie {
    
    public static Map<String, Map<Integer, Integer>> generateLotterySource() {
        Map<String, Map<Integer, Integer>> map = new HashMap<>();
        Set<String> keys = new HashSet<>();
        keys.add("R"); keys.add("I"); keys.add("O"); keys.add("A"); keys.add("D");
        Random r = new Random();
        int start = 1, end = 3;
        for (String key : keys) {
            Map<Integer, Integer> innerMap = new HashMap<>();
            for (int i = start; i <= end; i++) {
                innerMap.put(i, r.nextInt(101));
            }
            map.put(key, innerMap);
        }
        return map;
    }
    
    public static void main(String... args) throws IOException {
        Map<String, Map<Integer, Integer>> map = generateLotterySource();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj litere:");
        String letter = br.readLine();
        if (!map.containsKey(letter)) {
            /*System.out.println("Nie ma takiej litery!");
            return;*/
            throw new IllegalArgumentException("Nie ma takiej litery");
        }
        Map<Integer, Integer> innerMap = map.get(letter);
        System.out.println("Podaj cyfre:");
        Integer num = Integer.valueOf(br.readLine());
        if (!innerMap.containsKey(num)) {
            /*System.out.println("Nie ma takiej liczby!");
            return;*/
            throw new IllegalArgumentException("Nie ma takiej liczby");
        }
        Integer amountWon = innerMap.get(num);
        System.out.println("Wygrales: " + amountWon + " zl?");
    }
    
}

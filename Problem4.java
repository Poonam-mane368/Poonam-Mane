package test;

import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String input = sc.nextLine();
        input = input.replace("[", "").replace("]", "");
        String[] parts = input.split(",");

        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i].trim());
        }

        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 1; i <= 9; i++) map.put(i, 0);

        for (int num : arr) {
            for (int div = 1; div <= 9; div++) {
                if (num % div == 0) {
                    map.put(div, map.get(div) + 1);
                }
            }
        }

        System.out.println(map);
    }
}


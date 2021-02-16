package homeWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercises {
    public static List<String> createArraylist(String... color) {
        List<String> colors = new ArrayList<>();
        for (int i = 0; i < color.length; i++) {
            colors.add(color[i]);
        }
        return colors;
    }

    public static void iterateList(List<String> list) {
        list.stream().forEach(color -> System.out.println(color));
    }

    public static List<String> addNewElement(List<String> list, String color) {
        list.add(0, color);
        return list;
    }

    public static List<String> copyArraylist(List<String> list) {
        List<String> newList = new ArrayList<>(list);
        return newList;
    }

    public static int smallestNumber(int num1, int num2, int num3) {
        List<Integer> list = Stream.of(num1, num2, num3).sorted().collect(Collectors.toList());
        return list.get(0);
    }

    public static double average(int num1, int num2, int num3) {
        return Stream.of(num1, num2, num3).mapToInt(i -> i).average().getAsDouble();
    }

    public static boolean checkKey(Map<String, String> map, String key) {
        List<String> list = map.keySet().stream().filter(e -> e.equals(key)).collect(Collectors.toList());
        return !list.isEmpty();
    }

    public static void main(String[] args) {
        List<String> colors = createArraylist("Red", "Blue", "Orange");
        System.out.println(colors);
        System.out.println();

        iterateList(colors);
        System.out.println();

        System.out.println(addNewElement(colors, "Yellow"));
        System.out.println();

        System.out.println(copyArraylist(colors));
        System.out.println();

        System.out.println(smallestNumber(5, 80, -10));
        System.out.println();

        System.out.println(average(5, 8, 7));
        System.out.println();

        Map<String, String> map = new HashMap<>();
        map.put("Vienas", "One");
        map.put("Du", "Two");
        map.put("Trys", "Three");

        System.out.println(checkKey(map, "Vienas"));

    }
}

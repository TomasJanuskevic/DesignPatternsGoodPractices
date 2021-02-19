package homeWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercises {
    public List<String> createArraylist(String... color) {
        List<String> colors = new ArrayList<>();
        for (int i = 0; i < color.length; i++) {
            colors.add(color[i]);
        }
        return colors;
    }

    public void iterateList(List<String> list) {
        list.stream().forEach(color -> System.out.println(color));
    }

    public List<String> addNewElement(List<String> list, String color) {
        list.add(0, color);
        return list;
    }

    public List<String> copyArraylist(List<String> list) {
        List<String> newList = new ArrayList<>(list);
        return newList;
    }

    public int smallestNumber(int num1, int num2, int num3) {
        List<Integer> list = Stream.of(num1, num2, num3).sorted().collect(Collectors.toList());
        return list.get(0);
    }

    public double average(int num1, int num2, int num3) {
        return Stream.of(num1, num2, num3).mapToInt(i -> i).average().getAsDouble();
    }

    public boolean checkKey(Map<String, String> map, String key) {
        List<String> list = map.keySet().stream().filter(e -> e.equals(key)).collect(Collectors.toList());
        return !list.isEmpty();
    }

    public static void main(String[] args) {
        Exercises exercises = new Exercises();

        List<String> colors = exercises.createArraylist("Red", "Blue", "Orange");
        System.out.println(colors);
        System.out.println();

        exercises.iterateList(colors);
        System.out.println();

        System.out.println(exercises.addNewElement(colors, "Yellow"));
        System.out.println();

        System.out.println(exercises.copyArraylist(colors));
        System.out.println();

        System.out.println(exercises.smallestNumber(5, 80, -10));
        System.out.println();

        System.out.println(exercises.average(5, 8, 7));
        System.out.println();

        Map<String, String> map = new HashMap<>();
        map.put("Vienas", "One");
        map.put("Du", "Two");
        map.put("Trys", "Three");

        System.out.println(exercises.checkKey(map, "Vienas"));

    }
}

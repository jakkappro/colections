import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    private static ArrayList<Integer> list;
    private static HashMap<String, Integer> map;
    public static void main(String[] args) {
        //create arrayList
        list = new ArrayList<>(List.of(1, 1, 1, 2, 2, 3, 4, 5));
        list.forEach(System.out::println);
        //list.forEach((n) -> System.out.println(n));

        ArrayList<Human> people = new ArrayList<>(List.of(new Human("John", 21, 23000),
                new Human("Jfne", 19, 25000), new Human("Jqck", 18, 30000)));
        System.out.println(people.stream().mapToInt(Human::getBudget).sum());

        System.out.println(people.stream().anyMatch(n -> n.getName().contains("a")));

        HashSet<Integer> set = new HashSet<>(List.of(1, 1, 1, 2, 2, 3, 4, 5));
        set.forEach(System.out::println);

        map = new HashMap<>();
        map.put("Red", 1);
        map.put("Green", 2);
        map.put("Black", 3);
        map.put("White", 4);
        map.forEach((k, v) -> System.out.println(k + " " + v));

    }

    private static void addIfNotExists(int add) {
        if(!list.contains(add))
            list.add(add);
    }

    private static void removeEvenNumbers() {
        list.removeIf((n) -> n % 2 == 0);
    }

    private static List<Integer> returnEvenNumbersAsList() {
        return list.stream().filter((n) -> n % 2 == 0).collect(Collectors.toList());
    }

    private static void multiplyByLength() {
        list.replaceAll((n) -> n * list.size());
    }

    private static void addIfNotExists(String key, int value) {
        if(!map.containsKey(key))
            map.put(key, value);
    }
}

package dsa_stack_queue.tree_map;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        String string = "A paragraph is a series of related sentences developing a central idea, called the topic.";
        string = string.replace(",", "");
        string = string.replace(".", "");
        String[] array = string.split(" ");

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        for (String str : array) {
            String key = str.toLowerCase();
            if (!treeMap.containsKey(key))
                treeMap.put(key,1);
            else {
                int value = treeMap.get(key);
                value++;
                treeMap.replace(key,value);
            }
        }
        System.out.println(treeMap);
    }

}

import java.util.HashMap;
import java.util.Set;

public class duplicateCharacterCount {
    public static void main(String[] args) {
        String string = "Learn Java Programming";
        System.out.println(duplicateCharacterCounts(string));
    }

    public static HashMap<Character, Integer> duplicateCharacterCounts(String string) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch != ' ') {   // ignore spaces (optional)
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

//        for (char ch : map.keySet()) {
//            if (map.get(ch) > 1) {
//                System.out.println(ch+ " , " +map.get(ch));
//            }
//        }
        return map;
    }
}

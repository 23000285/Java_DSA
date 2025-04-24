package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hash {
    public static void main(String[] args) {
        HashMap<String, String> hash = new HashMap<>();

        hash.put("Name", "Krishna");
        hash.put("age", "15");
        hash.put("Salary", "100000");
        hash.put("Profession", "UI/UX Developer");

        Iterator<Map.Entry<String, String>> itr = hash.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<String, String> entry = itr.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

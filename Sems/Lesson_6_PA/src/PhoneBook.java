import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
public class PhoneBook {
    private static Map<String, ArrayList<Long>> phoneBook = new HashMap<>();

    public void add(String name, Long phoneNum) {
        if (!phoneBook.containsKey(name)){
            ArrayList<Long> list = new ArrayList<>();
            list.add(phoneNum);
            phoneBook.put(name, list);
        }else {
            phoneBook.get(name).add(phoneNum);
}
    }
    public ArrayList<Long> find(String name) {
        if (!phoneBook.containsKey(name)) {
            ArrayList<Long> list = new ArrayList<>();
            return list;
        }
        else{
            return phoneBook.get(name);
        }
    }
    public static void getPhoneBook() {
        ArrayList<Map.Entry<String, ArrayList<Long>>> list = new ArrayList<>(sorting());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        }
    private static ArrayList<Map.Entry<String, ArrayList<Long>>> sorting() {
        Map<String, ArrayList<Long>> copyPhoneBook = new HashMap<>();
        copyPhoneBook.putAll(phoneBook);
        ArrayList<Map.Entry<String, ArrayList<Long>>> sortArray = new ArrayList<>(phoneBook.size());
        Map.Entry<String, ArrayList<Long>> max;
        for (Map.Entry <String, ArrayList<Long>> i : copyPhoneBook.entrySet()) {
            max = i;
            for (Map.Entry<String, ArrayList<Long>> j : copyPhoneBook.entrySet()){
                if(sortArray.contains(max)) {
                    max = j;
                }
                if (j.getValue().size() > max.getValue().size() && !sortArray.contains(j)){
                    max = j;
                }
            }
            sortArray.add(max);
        }
        return sortArray;
            }
        }

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

    PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Алексей", 89225658855L);
        phoneBook.add("Борис", 8925266699L);
        phoneBook.add("Вова", 89227156325L);
        phoneBook.add("Гена", 89224569877L);
        phoneBook.add("Дмитрий", 89220230012L);
        phoneBook.add("Елена", 89220022658L);
        phoneBook.add("Жан", 89220236658L);
        phoneBook.add("Зина", 89220235567L);
        phoneBook.add("Игнат", 89220236654L);

        phoneBook.add("Борис", 88885456554L);
        phoneBook.add("Борис", 89252666994L);
        phoneBook.add("Жан", 89662566633L);

        PhoneBook.getPhoneBook();
    }
}
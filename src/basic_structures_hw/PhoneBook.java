package basic_structures_hw;

import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.*;

/*2. Написать простой класс PhoneBook(внутри использовать HashMap):
  - В качестве ключа использовать фамилию
  - В каждой записи всего два поля: phone, e-mail
  - Отдельный метод для поиска номера телефона по фамилии (ввели фамилию, получили ArrayList телефонов),
  и отдельный метод для поиска e-mail по фамилии. Следует учесть, что под одной фамилией может быть несколько записей.
  Итого должно получиться 3 класса Main, PhoneBook, Person.*/
public class PhoneBook {
    private HashMap<String, ArrayList<ArrayList<String>>> phoneBook=new HashMap<>();

    public PhoneBook(Person p) {
        ArrayList<ArrayList<String>> buffer = new ArrayList<>();
        buffer.add(p.getPhones());
        buffer.add(p.getMails());
        assert phoneBook != null;
        phoneBook.put(p.getName(), buffer);

    }

    public ArrayList<String> getPhones(String serName) {
        ArrayList<ArrayList<String>> buffer = new ArrayList<>(phoneBook.get(serName));
        return buffer.get(0);
    }

    public ArrayList<String> getMails(String serName) {
        ArrayList<ArrayList<String>> buffer = new ArrayList<>(phoneBook.get(serName));
        return buffer.get(1);
    }


}

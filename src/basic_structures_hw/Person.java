package basic_structures_hw;

import java.util.ArrayList;
import java.util.Arrays;

public class Person {
    private String name;
    private ArrayList<String> phones;
    private ArrayList<String> mails;

    public Person(String name, String[] phones, String[] mails) {
        this.name = name;
        this.phones = new ArrayList<>(Arrays.asList(phones));
        this.mails = new ArrayList<>(Arrays.asList(mails));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getPhones() {
        return phones;
    }



    public ArrayList<String> getMails() {
        return mails;
    }


}

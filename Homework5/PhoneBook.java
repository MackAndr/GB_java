package homework5;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private static HashMap<String, ArrayList<String>> phoneNumbers = new HashMap<>();

    public void add (String name, String number) {
        if(phoneNumbers.containsKey(name)) {
            phoneNumbers.get(name).add(number);
        } else {
            ArrayList<String> values = new ArrayList<>();
            values.add(number);
            phoneNumbers.put(name,values);
        }
    }
    public ArrayList<String> find(String name) {
        if(phoneNumbers.containsKey(name)) {
            return phoneNumbers.get(name);
        }
        return new ArrayList<String>();
    }
}

package oop.homwork7;

import java.util.*;

public class PhoneBook {
    Map<String, Set<String>> phoneBook = new HashMap<>();

    public void add(String fullName, String phoneNumber) {
        Set<String> temp = phoneBook.get(fullName);
        if (temp != null) {
            temp.add(phoneNumber);
        } else {
            temp = new HashSet<>();
            temp.add(phoneNumber);
        }
        phoneBook.put(fullName, temp);
    }

    public Set<String> find(String fullName) {
        return phoneBook.get(fullName);
    }

    public boolean containsPhoneNumber(String phoneNumber) {
        for (Set<String> temp : phoneBook.values()) {
            for (String str : temp) {
                if (str.equals(phoneNumber)) {
                    return true;
                }
            }
        }
        return false;
    }
}
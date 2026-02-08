package Ten;

import java.util.ArrayList;

class LostAndFoundOffice {
    // создайте список things
    static ArrayList<Object> LAF = new ArrayList<>();

    // реализуйте метод put()
    static void put(Object thing) {
        LAF.add(thing);
    }

    // реализуйте метод check()
    static boolean check(Object thing) {
        for (Object object : LAF) { // логика проверки вещи в списке
            if (object.equals(thing)) {
                return true;
            }
        }
        return false;
    }
}

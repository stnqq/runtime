package practices;

import java.util.ArrayList;


public class ListControlTask {
    public static void main(String[] args) {

        // task 1
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Lia");
        names.add("Ramazan");
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).length() < 4) {
                names.remove(i);
            }
        }
        System.out.println("task 1 - " + names);


        // task 2
        ArrayList<String> userRoles = new ArrayList<>();
        int count = 0;
        userRoles.add("admin");
        userRoles.add("user");
        userRoles.add("user");
        for (String userRole : userRoles) {
            if (userRole.equals("user")) {
                count++;
            }
        }
        System.out.println("task 2 - " + "total count of occurrences of 'user' is: " + count);

        // task 3
        ArrayList<String> namesGirls = new ArrayList<>();
        ArrayList<String> namesBoys = new ArrayList<>();
        namesGirls.add("Sasha");
        namesGirls.add("Masha");
        namesGirls.add("Dasha");
        namesGirls.add("Dash");
        namesBoys.add("Sasha");
        namesBoys.add("Slava");

        ArrayList<String> concatNames = new ArrayList<>();

        if (namesGirls.size() >= namesBoys.size()) {
            concatNames.addAll(namesGirls);
            for (int i = 0; i < namesBoys.size(); i++) {
                if (!namesBoys.contains(concatNames.get(i))) {
                    concatNames.add(namesBoys.get(i));
                }
            }
        } else {
            concatNames.addAll(namesBoys);
            for (int i = 0; i < namesGirls.size(); i++) {
                if (!namesGirls.contains(concatNames.get(i))) {
                    concatNames.add(namesGirls.get(i));
                }
            }
        }

        System.out.println("task 3 - " + concatNames);

        // task 4
        ArrayList<String> dictionary = new ArrayList<>();
        ArrayList<String> dictionaryFilter = new ArrayList<>();

        dictionary.add("spoonn");
        dictionary.add("lol");


        for (String s : dictionary) {
            if (s.length() > 5) {
                dictionaryFilter.add(s);
            }
        }
        System.out.println("task 4 - " + dictionaryFilter);

        // task 5
        ArrayList<String> playerRoles = new ArrayList<>();
        playerRoles.add("admin");
        playerRoles.add("user");
        playerRoles.add("guest");
        playerRoles.add("user");

        playerRoles.replaceAll(string -> string.replace("user", "client"));
        System.out.println("task 5 - " + playerRoles);

        // task 6
        ArrayList<String> words = new ArrayList<>();
        int max = 0;
        String tempWord = "";
        words.add("Sasha");
        words.add("tableeee");
        words.add("q");

        for (String word : words) {
            if (word.length() > max) {
                tempWord = word;
                max = word.length();
            }
        }
        System.out.println("task 6 - " + tempWord);

        // task 7
        ArrayList<String> duplicatedList = new ArrayList<>();
        ArrayList<String> filteredList = new ArrayList<>();
        duplicatedList.add("admin");
        duplicatedList.add("user");
        duplicatedList.add("guest");
        duplicatedList.add("user");

        for (String s : duplicatedList) {
            if (!filteredList.contains(s)) {
                filteredList.add(s);
            }
        }
        System.out.println("task 7 - " + filteredList);

        // task 8
        ArrayList<String> actions = new ArrayList<>();
        actions.add("play");
        actions.add("stop");
        actions.add("pause");
        actions.add("next");

        System.out.println("task 8 - " + "Введите количество действий, которые хотите увидеть: ");
//        int limit = scanner.nextInt();
        int limit = 5;
        printLastActions(actions, limit);

        // task 9
        ArrayList<String> users = new ArrayList<>();
        ArrayList<String> blacklist = new ArrayList<>();
        users.add("admin");
        users.add("user");
        users.add("guest");
        users.add("danil");
        blacklist.add("admin");
        blacklist.add("user");
        blacklist.add("guest");

        users.removeAll(blacklist);

        System.out.println("task 9 - " + users);
    }

    // task 8
    static void printLastActions(ArrayList<String> actions, int limit) {
        System.out.println("User actions: ");
        if (actions.size() < limit) {
            for (int i = 0; i < actions.size(); i++) {
                System.out.println((i + 1) + " - " + actions.get(i));
            }
        } else {
            for (int i = 0; i < limit; i++) {
                System.out.println((i + 1) + " - " + actions.get(i));
            }
        }
    }
}

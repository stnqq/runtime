package Practices.Bot;

public class Practice {
        public static void main(String[] args) {
            Bot bot = new Bot("R2-D2"); // с параметром
            Bot bot2 = new Bot(); // без параметра
            Bot bot3 = new Bot("R2-D2", 2); // с параметром

            System.out.println(bot2.name);

            System.out.println("bot3 name:" + bot3.name + " bot3 version: " + bot3.version);
        }
    }

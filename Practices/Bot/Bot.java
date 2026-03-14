package Practices.Bot;

    public class Bot {
        String name;
        int version;

        public Bot() { // конструктор без параметров
            System.out.println("Чат-бот создан");
            name = "Алиса";
        }
        public Bot(String name) { // конструктор с параметром
            this(); // вызвали конструктор без параметров
            this.name = name;
            System.out.println("Вас приветствует " + name);
        }
        public Bot(String name, int version){
                this(name);
                this.version = version;
                System.out.println("Версия бота: " + version);
            }
        }

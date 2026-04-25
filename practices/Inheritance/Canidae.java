package practices.Inheritance;

    public class Canidae extends Animal { // здесь происходит наследование
        protected boolean isPredator; // добавляем новое поле: хищник или нет
        public Canidae() { // добавляем конструктор
            isPredator = true;
        }
        public String growl() { // добавляем новый метод - рычание
            return "Р-р-р-р-р!";
        }
    }

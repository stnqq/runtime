package Eleven;

public class SwitchEdit {
    public static void main(String[] args) {
        System.out.println(getPopulationPercent(Continent.ASIA));
    }

    public static String getPopulationPercent(Continent continent) {
        String result;

        if (continent == null) {
            return "Такого материка не существует.";
        }

        switch (continent) {
            case ASIA:
                result = "59.5%";
                break;
            case AFRICA:
                result = "16.9%";
                break;
            case NORTH_AMERICA:
                result = "7.7%";
                break;
            case SOUTH_AMERICA:
                result = "5.6%";
                break;
            case ANTARCTICA:
                result = "<0.1%";
                break;
            case EUROPE:
                result = "9.7%";
                break;
            case AUSTRALIA:
                result = "0.5%";
                break;
            default:
                return "Такого материка не существует.";
        }
        return result;
    }

    enum Continent {
        ASIA,
        AFRICA,
        NORTH_AMERICA,
        SOUTH_AMERICA,
        ANTARCTICA,
        EUROPE,
        AUSTRALIA
    }
}
package ru.mirea.lab4;

public enum TimeOfYear {
    WINTER("Зима",-15.4),
    SPRING("Весна",10.3),
    SUMMER("Лето",25.9),
    AUTUMN("Осень",6.2);

    private final String translation;
    private final double medTemp;

    public String getDescription(TimeOfYear season) {
        if (season == SUMMER) {
            return "теплое время года";
        } else {
            return "холодное время года";
        }
    }

    public String getTranslation(TimeOfYear season) {
        return season.translation;
    }

    public double getMedTemp(TimeOfYear season) {
        return season.medTemp;
    }

    public void printString(TimeOfYear season) {
        switch(season) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
            default:
                System.out.println("Ошибка!");
        }
    }

    TimeOfYear(String translation, double medTemp) {
        this.translation = translation;
        this.medTemp = medTemp;
    }
}

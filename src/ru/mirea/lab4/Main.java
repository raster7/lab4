package ru.mirea.lab4;

public class Main {
    public static void main(String[] args) {
        TimeOfYear season1 = TimeOfYear.SUMMER;
        season1.printString(season1);

        TimeOfYear season2 = TimeOfYear.AUTUMN;
        System.out.println(season2.getDescription(season2));

        for (TimeOfYear season: TimeOfYear.values()) {
            System.out.println(season.getTranslation(season) + " - " + season.getDescription(season) + ", средняя температура: " + season.getMedTemp(season) + " по Цельсию");
        }
    }
}
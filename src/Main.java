public class Main {
    public static void main(String[] args) {
        // Задача 1
        int age = 21;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " +
                    age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " +
                    age + " , то он не достиг совершеннолетия, нужно немного подождать.");
        }
        System.out.println();
        // Задача 2
        int temperature = 7;
        if (temperature < 5) {
            System.out.println("На улице " +
                    temperature + " градусов, нужно надеть шапку");
        }
        if (temperature > 5) {
            System.out.println("На улице " +
                    temperature + " градусов, можно идти без шапки");
        }
        System.out.println();
        // Задача 3
        int speed = 75;
        if (speed <= 60) {
            System.out.println("Если скорость " +
                    speed + " ,то можно ехать спокойно");
        } else {
            System.out.println("Если скорость " +
                    speed + " ,то придется заплатить штраф");
        }
        System.out.println();
        // Задача 4
        int years = 26;
        if (years > 2 && years <= 6) {
            System.out.println("Если возраст человека равен " +
                    years + " ,то ему нужно ходить в детский сад");
        } else if (years >= 7 && years <= 17) {
            System.out.println("Если возраст человека равен " +
                    years + " ,то ему нужно ходить в школу");
        } else if (years >= 18 && years <= 24) {
            System.out.println("Если возраст человека равен " +
                    years + " ,то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " +
                    years + " ,то ему нужно ходить на работу");
        }
        System.out.println();
        // Задача 5
        int ageRestrictions = 5;
        if (ageRestrictions < 5) {
            System.out.println("Если возраст ребенка равен " +
                    ageRestrictions + " , то ему  нельзя кататься на аттракционе");
        } else if (ageRestrictions >= 5 && ageRestrictions < 14) {
            System.out.println("Если возраст ребенка равен " +
                    ageRestrictions + " , то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " +
                    ageRestrictions + " , то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println();
        // Задача 6
        int occupiedPlaces = 52;
        int totalPlace = 102;
        int sitPlace = 60;
        if (occupiedPlaces < 60) {
            System.out.println("В вагоне есть " +
                    (sitPlace - occupiedPlaces) + " сидячих мест");
        } else if (occupiedPlaces >= 60 && occupiedPlaces < 102) {
            System.out.println("В вагоне осталось " +
                    (totalPlace - occupiedPlaces) + " стоячих места");
        } else {
            System.out.println("Мест нет!");
        }
        System.out.println();
        // Задача 7
        int one = 570;
        int two = 501;
        int three = 555;
        if (one > two && one > three) {
            System.out.println(one);
        } else if (two > one && two > three) {
            System.out.println(two);
        } else if (three > one && three > two) {
            System.out.println(three);
        }
    }
}



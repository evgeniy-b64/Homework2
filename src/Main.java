public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task67();
        //task7();
        task8();
    }

    public static void task1 () {// Пишем код для задачи 1
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 1 Инициализация||" );
        System.out.println(separator);
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = "+dog);
        System.out.println("cat = "+cat);
        System.out.println("paper = "+paper);
    }

    public static void task2 () {// Пишем код для задачи 2
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 2 Сложение||");
        System.out.println(separator);
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4.0;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("dog = "+dog);
        System.out.println("cat = "+cat);
        System.out.println("paper = "+paper);
    }
    public static void task3 () {// Пишем код для задачи 3
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 3 Вычитание||");
        System.out.println(separator);
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("dog = "+dog);
        System.out.println("cat = "+cat);
        System.out.println("paper = "+paper);
    }
    public static void task4 () {// Пишем код для задачи 4
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 4 Деление ||" );
        System.out.println(separator);
        var friend = 19;
        System.out.println("friend = "+friend);
        friend = friend+2;
        System.out.println("friend = "+friend);
        friend = friend / 7;
        System.out.println("friend = "+friend);
    }

    public static void task5 () {// Пишем код для задачи 5
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 5 Умножение ||" );
        System.out.println(separator);
        var frog = 3.5;
        System.out.println("frog = "+frog);
        frog = frog*10;
        System.out.println("frog = "+frog);
        frog = frog / 3.5;
        System.out.println("frog = "+frog);
        frog = frog + 4;
        System.out.println("frog = "+frog);
    }
    public static void task67 () {// Пишем код для задачи 6, 7
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 6, 7 ||" );
        System.out.println(separator);
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var weightSum = boxer1Weight+boxer2Weight;
        System.out.println("Weight sum = "+ weightSum);
        var weightDiff = Math.abs(boxer1Weight-boxer2Weight);
        System.out.println("1. Weight difference = "+ weightDiff);
        if (boxer1Weight>boxer2Weight) {weightDiff = boxer1Weight%boxer2Weight;}
        else {weightDiff = boxer2Weight%boxer1Weight;}
        System.out.println("2. Weight difference = "+ weightDiff);
    }
    public static void task8 () {// Пишем код для задачи 8
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 8 ||" );
        System.out.println(separator);
        var totalTime = 640;
        var timePerWorker = 8;
        var workersNumber = totalTime / timePerWorker;
        System.out.println("Всего работников в компании — "+ workersNumber +" человек");
        workersNumber = workersNumber + 94;
        totalTime = workersNumber * 8;
        System.out.println("Если в компании работает "+ workersNumber + " человек, то всего " + totalTime + " часов работы может быть поделено между сотрудниками");
    }
}
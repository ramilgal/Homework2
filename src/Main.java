public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        double dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Задача 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Задача 3");
        dog = dog - 3.5;
        cat =  cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println("Задача 6");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var boxersWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес бойцов " + boxersWeight + " кг");
        var differenceWeight = firstBoxer - secondBoxer;
        System.out.println("Разница между весами бойцов " + differenceWeight + " кг");

        System.out.println("Задача 7");
        differenceWeight = secondBoxer - firstBoxer;
        System.out.println("Разница между весами бойцов " + differenceWeight + " кг");

        var differenceWeightPlus = secondBoxer % firstBoxer;
        System.out.println("Разница между весами бойцов " + differenceWeightPlus + " кг");
        System.out.println("Задача 8");
        var totalHoursOfWork = 640;
        var numberOfEmployees = totalHoursOfWork / 8;
        System.out.println("Всего работников в компании – " + numberOfEmployees + " человек");
        var numberOfEmployeesPlus = numberOfEmployees + 94;
        var totalHoursOfWorkMore = numberOfEmployeesPlus * 8;
        System.out.println("Если в компании работает " + numberOfEmployeesPlus + " человек, то всего " + totalHoursOfWorkMore + " часов работы может быть поделено между сотрудниками");
    }
}
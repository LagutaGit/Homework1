// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Задача 1

        var dog = 8.0;
        var cat = 3.6;
        var papper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(papper);

        //Задача 2
        dog = dog + 4;
        cat = cat + 4;
        papper = papper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(papper);

        //Задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        papper = papper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(papper);

        //Задача 4
        var friend = 19;
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //Задание 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog + "\n");

        //Задача 6
        var m1 = 78.2;
        var m2 = 82.7;
        var m3 = m1 + m2;
        System.out.println(m3);
        System.out.println(m2 - m1 + "\n");

        // Задание 7
        System.out.println(m2 - m1);
        System.out.println(m2 % m1 + "\n");

        //Задача 8.1
        var allTime = 640;
        var onePerson = 8;
        var itogo = allTime / onePerson;
        System.out.println("Всего работников в компании — " + itogo + " человек");

        // Задание 8.2
        itogo = 94;
        onePerson = onePerson * 8;
        System.out.println("Если в компании работает " + itogo + " человек, то всего " + onePerson + " часов работы может быть поделено между сотрудниками");
    }
}
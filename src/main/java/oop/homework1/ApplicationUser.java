package oop.homework1;

public class ApplicationUser {
    public static void main(String[] args) {
        // Test User
        User[] users = new User[10];
        User user1 = new User("Федоров Федор Иванович", 1965, "fedor.com");
        User user2 = new User("Владимиров Виктор Викторович", 1978, "vladim.com");
        User user3 = new User("Иванова Анна Викторовна", 1991, "ivan.com");
        User user4 = new User("Федькина Роза Максимовна", 1987, "roza.com");
        User user5 = new User("Алешин Алексей Владимирович", 1991, "alex.com");
        User user6 = new User("Федорова Виктория Александровна", 1969, "vika.com");
        User user7 = new User("Пономарева Светлана Викторовна", 1973, "sveta.com");
        User user8 = new User("Максимов Максим Олегович", 1985, "max.com");
        User user9 = new User("Дмитриев Дмитрий Владимирович", 1990, "dim.com");
        User user10 = new User("Мишин Михаил Михайлович", 1985, "miha.com");


        users[0] = user1;
        users[1] = user2;
        users[2] = user3;
        users[3] = user4;
        users[4] = user5;
        users[5] = user6;
        users[6] = user7;
        users[7] = user8;
        users[8] = user9;
        users[9] = user10;

        for (int i = 0; i < users.length; i++) {
            if (2025 - users[i].getBirthday() > 40) {
                users[i].showInfo();

            }

        }
        // Test box

        Box box = new Box("20x40", "red");
        System.out.println(box.isOpen());
        System.out.println(box.getPredmet());

        box.putIn("PREDMET1");
        System.out.println(box.getPredmet());

        box.open();
        box.putIn("PREDMET2");
        System.out.println(box.getPredmet());

        box.putOut();
        System.out.println(box.getPredmet());

    }

}

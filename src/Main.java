
public class Main {
    public static void main(String[] args) {

                                        // Задание 1
        Person pers = new Person("Булочкин","Георгий","Леонидович",45,
                "Повар",1000f,"+375(33)941-18-15","Chef@gmail.com");
        pers.info();

                                        // Задание 2
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Музыкантов","Аркадий","Васильевич",39,
                "Композитор",1000f,"+375(25)854-30-22","DJ@gmailbox.com");

        persArray[1] = new Person("Денежкин","Валерий","Иванович",63,
                "Директор",5000f,"+375(29)777-77-77","Boss@gmail.com");

        persArray[2] = new Person("Скороходов","Cергей","Петрович",42,
                "Водитель",1000f,"+375(29)519-25-26","Racer@gmail.com");

        persArray[3] = new Person("Лампочкин","Анатолий","Борисович",44,
                "Электрик",1000f,"+375(25)311-29-54","Tesla@gmail.com");

        persArray[4] = new Person("Кодиков","Арсений","Семёнович",25,
                "Разработчик",2000f,"+375(33)247-15-10","CtrlC_CtrlV@gmail.com");

        for(int i = 0; i < persArray.length; i++)
            persArray[i].info();

                                        // Задание 3
        Park.InfoAboutAttractions bigWheel = new Park().new InfoAboutAttractions
                ("Колесо обозрения","10:00 - 22:00",10);
        bigWheel.info();

        Park.InfoAboutAttractions rollerСoaster = new Park().new InfoAboutAttractions
                ("Американские горки","10:00 - 20:00",15);
        rollerСoaster.info();
    }
}

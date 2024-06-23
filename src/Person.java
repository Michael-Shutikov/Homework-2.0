
public class Person {

    private String lastName, firstName, fatherName, position, phoneNumber, email;
    private float salary;
    private int age;

    public Person(String lastName, String firstName, String fatherName, int age,
                    String position,float salary, String phoneNumber, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.fatherName = fatherName;
        this.age = age;
        this.position = position;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void info() {
        System.out.print("\n" + "Фамилия: "        + lastName
                       + "\n" + "Имя: "            + firstName
                       + "\n" + "Отчество: "       + fatherName
                       + "\n" + "Возраст: "        + age
                       + "\n" + "Должность: "      + position
                       + "\n" + "Зарплата: "       + salary + " $"
                       + "\n" + "Номер телефона: " + phoneNumber
                       + "\n" + "Email: "          + email
                       + "\n" );
    }
}



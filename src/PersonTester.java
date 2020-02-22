import java.util.Scanner;

public class PersonTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj imię");
        String name = sc.nextLine();
        System.out.println("Podaj nazwisko");
        String lastName = sc.nextLine();
        System.out.println("Podaj wiek");
        int age = sc.nextInt();

        try {
            Person person = new Person(name, lastName, age);
            System.out.println(person.toString());
        } catch (NameUndefinedException | IncorrectAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;
    private static final int MIN_NAME_LENGTH = 2;
    private static final int MIN_AGE = 1;

    public Person(String firstName, String lastName, int age) throws NameUndefinedException, IncorrectAgeException {
        if(checkName(firstName, lastName)) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        if(checkAge(age)) {
            this.age = age;
        }
    }

    private boolean checkName(String firstName, String lastName) throws NameUndefinedException{
        if(firstName==null || lastName==null)
            throw new NameUndefinedException("Nie można stworzyć osoby bez imienia lub nazwiska!!");
        else if(firstName.length()<MIN_NAME_LENGTH || lastName.length()<MIN_NAME_LENGTH)
            throw new NameUndefinedException("Nie można stworzyć osoby o imieniu lub nazwisku krótszym niż 2 znaki!!");
        else
            return true;
    }

    private boolean checkAge(int age) throws IncorrectAgeException{
        if(age<MIN_AGE)
            throw new IncorrectAgeException("Nie można stworzyć osoby w wieku mniejszym niż rok!!");
        else
            return true;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}

package software.ulpgc;

import java.time.LocalDate;

public class Person {
    public static final int DaysPerYear = 365;
    private final String name;
    private final LocalDate birthdate;

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return toYears(LocalDate.now().toEpochDay()- birthdate.toEpochDay());
    }

    private int toYears(long days) {
        return (int) (days/ DaysPerYear);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthdate=" + birthdate +
                ", age=" + getAge() +
                '}';
    }
}

package software.ulpgc;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.printf(String.valueOf(new Person("alberto", LocalDate.of(2004,8,27))));
    }
}

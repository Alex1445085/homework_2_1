import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 5.
        int value = 33;
        System.out.println("5. value = " + value);
        changeValue5(value);
        System.out.println("5. new value = " + value);
        // 6.
        Integer value1 = 33;
        System.out.println("6. value1 = " + value1);
        changeValue6(value1);
        System.out.println("6. new value1 = " + value1);
        // 7.
        int[] value2 = new int[] {3, 4};
        System.out.println("7. value2 = " + Arrays.toString(value2));
        changeValue7(value2);
        System.out.println("7. new value2 = " + Arrays.toString(value2));
        // 8.
        Integer[] value3 = new Integer[] {3, 4};
        System.out.println("8. value3[] = " + Arrays.toString(value3));
        changeValue8(value3);
        System.out.println("8. new value3[] = " + Arrays.toString(value3));
        // 9.
        Person person = new Person("Liapis", "Trubetskoy");
        System.out.println("chelovek = " + person);
        Person.changePerson(person);
        System.out.println("chelovek after change = " + person);
        // 10.
        Person person1 = new Person("Liapis", "Trubetskoy");
        System.out.println("chelovek = " + person1);
        person1 = null;
        System.out.println("chelovek = " + person1);
        Person.changePerson1(person1);
        System.out.println("chelovek after change = " + person1);
    }

    public static void changeValue5(int value) {
        value = 22;
        System.out.println("value to change = " + value);
    }
    public static void changeValue6(Integer value) {
        value = 22;
        System.out.println("value1 to change= " + value);

    }
    public static void changeValue7(int[] value) {
        value = new int[] {1, 2};
        System.out.println("value to change = " + Arrays.toString(value));
    }
    public static void changeValue8(Integer[] value) {
        value[0] = 99;
        System.out.println("value to change = " + Arrays.toString(value));
    }
}
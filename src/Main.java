import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int value = 33;
        System.out.println("1. value = " + value);
        changeValue(value);
        System.out.println("3. value = " + value);

        Integer value1 = 33;
        System.out.println("4. value1 = " + value1);
        changeValue1(value1);
        System.out.println("6. value1 = " + value1);

        int[] value2 = new int[] {3, 4};
        System.out.println("value = " + Arrays.toString(value2));
        chageValue2(value2);
        System.out.println("value new = " + Arrays.toString(value2));
    }

    public static void changeValue(int value) {
        value = 22;
        System.out.println("2. value = " + value);
    }
    public static void changeValue1(Integer value) {
        value = 22;
        System.out.println("5. value1 = " + value);

    }
    public static void chageValue2(int[] value) {
        value = new int[] {1, 2};
        System.out.println("value to change = " + Arrays.toString(value));
    }
}
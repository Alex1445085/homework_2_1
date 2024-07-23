public class Main {
    public static void main(String[] args) {

        int value = 33;
        System.out.println("1. value = " + value);
        changeValue(value);
        System.out.println("3. value = " + value);

        Integer value1 = 44;
        System.out.println("4. value1 = " + value1);
        changeValue1(value1);
        System.out.println("6. value1 = " + value1);
    }
    public static void changeValue(int value) {
        value = 22;
        System.out.println("2. value = " + value);
    }
    public static void changeValue1(Integer value) {
        value = 11;
        System.out.println("5. value1 = " + value);
    }
}
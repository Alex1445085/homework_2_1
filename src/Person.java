import org.jetbrains.annotations.NotNull;

public class Person {
    private String name;
    private String surName;

    public Person(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }
    public String getName() {
        return this.name;
    }
    public String getSurName() {
        return this.surName;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurName(String surName) {
        this.surName = surName;
    }
    public static void changePerson(Person person) {
        person = new Person("Ilya", "Lagutenko");
    }
    public static void changePerson1(@NotNull Person person) {
        person.setName("Ilya");       // is equals
        person.surName = "Lagutenko"; // is equals
    }
    @Override
    public String toString() {
        return "Имя " + this.name + ", фамилия " + this.surName;
    }
}

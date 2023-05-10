public class Main {
    public static void main(String[] args) {
        Person person = new Person("Marek", 12, 1.85);
        person.setAge(18);
        System.out.println(person);
        System.out.println(person.hashCode());

        Person person1 = Person.builder()
                .name("Tomek")
                .age(22)
                .height(0.89)
                .build();
        System.out.println(person1);
        person1 = person1.toBuilder()
                .height(1.78)
                .build();
        System.out.println(person1);
    }
}

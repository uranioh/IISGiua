public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void canTheyLegallyFuck(Person a, Person b) {
        if (a.age >= 18 && b.age >= 18) {
            System.out.println("No problems right there officer");
        }

        if (a.age < 18 && b.age < 18) {
            System.out.println("Eja divertiti ne");
        }

        if (a.age >= 18 && b.age < 18 || a.age < 18 && b.age >= 18) {
            if (a.age >= 18 && b.age >= 14 || a.age >= 14 && b.age >= 18) {
                System.out.println("I mean legally but bruh");
            } else {
                System.out.println("Ayo????");
            }
        }
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
}

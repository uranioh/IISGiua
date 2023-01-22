public class Main {
    public static void main(String[] args) {
        Person loworenzo = new Person("LOwOrenzo", 19);
        Person elisagoddi = new Person("Elisa Goddi", 13);

        Person.canTheyLegallyFuck(loworenzo, elisagoddi);

//        ayo fake id???
        loworenzo.setAge(15);
        Person.canTheyLegallyFuck(loworenzo, elisagoddi);


        System.out.println("Infos (could be fake could be not)");
        System.out.println(loworenzo.getName() + "'s age: " + loworenzo.getAge());
        System.out.println(elisagoddi.getName() + "'s age: " + elisagoddi.getAge());
    }
}
public class PeopleTester {
    public static void main(String[] args) {
        People people1 = new People("Howard Roark", 22, "Brown");
        People people2 = new People("Sam Ismail", 26, "Black");


        System.out.println(People.talk(people1.getName()));
        System.out.println(people1);

        System.out.println(People.talk(people2.getName()));
        System.out.println(people2);

    }

}

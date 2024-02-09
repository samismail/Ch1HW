public class PeopleTester {
    public static void main(String[] args) {

        String name = "Sam Ismail";
        System.out.println(People.talk(name));
        People people1 = new People(name, 26, "Black");

        System.out.println(people1);

        name = "Howard Roark";

        System.out.println(People.talk(name));
        System.out.println(people1);



    }

}

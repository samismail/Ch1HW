/*Class: People
Author: Sam Ismail
Date: 02/02/2024
Description: main class to output all information of people
 */

public class People {
    private String name;
    private int age;
    private String eyeColor;

    public People(String name, int age, String eyeColor) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public static String talk(String name) {
        return "Welcome, coders! I am " + name;
    }

    @Override
    public String toString() {
        return  "Name: " + name + '\n' +
                "Age: " + age + '\n' +
                "Eye Color: " + eyeColor;
    }
}

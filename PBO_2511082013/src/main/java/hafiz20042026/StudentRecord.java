package hafiz20042026;

import java.util.Scanner;

public class StudentRecord {
    private static String name;
    private static String address;
    private static String age;
    private static double mathGrade;
    private static double englishGrade;
    private static double scienceGrade;
    private static double average;

    private static int studentGrade;

    public static String getName() {
        return name;
    }

    public static String getAddress() {
        return address;
    }

    public static String getAge() {
        return age;
    }

    public static double getMathGrade() {
        return mathGrade;
    }

    public static double getEnglishGrade() {
        return englishGrade;
    }

    public static double getScienceGrade() {
        return scienceGrade;
    }

    public static double getAverage() {
        return (mathGrade+englishGrade+scienceGrade)/3;
    }

    public static int getStudentGrade() {
        return studentGrade;
    }

    public StudentRecord(String name) {
        this.name = name;
    }

    public StudentRecord(String name, String address, String age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public StudentRecord(String name, String address, String age, double mathGrade, double englishGrade, double scienceGrade) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        this.scienceGrade = scienceGrade;
    }

    public static void displayIdentities(String name) {
        System.out.println("Name: " + name);
    }

    public static void displayIdentities(String name, String address, String age) {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
    }

    public void displayIdentities(String name, String address, String age, double mathGrade, double englishGrade, double scienceGrade) {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Math Grade: " + mathGrade);
        System.out.println("English Grade: " + englishGrade);
        System.out.println("Science Grade: " + scienceGrade);
        System.out.println("Average: " + (mathGrade+englishGrade+scienceGrade)/3);
    }
}

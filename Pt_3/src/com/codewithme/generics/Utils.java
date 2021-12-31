package com.codewithme.generics;

public class Utils {
    public static <T extends Comparable<T>> T max(T first, T second) {
        return (first.compareTo(second) < 0) ? second : first;
    }

    /* User 객체를 프린트하는 메서드 */
    public static void printUser(User user) {
        System.out.println(user);
    }

    public static void printInstructor(Instructor instructor){
        System.out.println(instructor);
    }

    /* User list를 프린트하는 메서드 */
    public static void printUsers(GenericList<User> users){}

    public static void printInstructors(GenericList<Instructor> instructors) {}
}

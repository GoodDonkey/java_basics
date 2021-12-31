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

    /* User list를 프린트하는 메서드
    * 와일드카드를 사용하면 임의의 캡쳐 클래스(class CAP#1)를 받는다고 가정한다.
    * 이 클래스에 get() 메서드가 있다.
    * 와일드카드에 상속클래스를 지정하면 캡쳐 클래스도 상속한다.(class CAP#1 extends User)
    * 이는 Instructor 클래스가 User 클래스를 상속하는 것과 비슷.(class Instructor extends User) */
    public static void printUsers(GenericList<? extends User> users){
        User x = users.get(0);
//        users.add(); // capture 클래스를 알 수 없다.
    }

    /* User 클래스가 상속하는 임의의 부모클래스를 객체를 가지는 GenericList가 파라미터가 된다. */
    public static void printUsers2(GenericList<? super User> users){
        GenericList<Object> temp = new GenericList<>(); // 이러한 형태의 GenericList로 취급된다고 생각하면 된다.
        users.add(new Instructor(1));
        users.add(new User(1));
        Object x = users.get(0); // Object 로 자동 upcasting
        User y = (User) users.get(1); // User 로 down casting 해주면 사용 가능.
    }

}

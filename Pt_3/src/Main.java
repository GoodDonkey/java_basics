import com.codewithme.generics.GenericList;
import com.codewithme.generics.Instructor;
import com.codewithme.generics.User;
import com.codewithme.generics.Utils;

public class Main {

    public static void main(String[] args) {
        /* parameter 로 Instructor 객체는 User 객체로 취급될 수 있다. */
        User user = new Instructor(1);
        Utils.printUser(user);
        System.out.println(user.getClass());

        /* 이 경우는 원래 Instructor 가 아니었기 때문에 다운캐스팅 될 수 없다. */
//        Instructor instructor = (Instructor) new User(1);
//        Utils.printInstructor(instructor);
//        System.out.println(instructor.getClass());

        var users = new GenericList<Instructor>();
        Utils.printUsers(users);

        var users2 = new GenericList<User>();
        Utils.printInstructors(users2);
    }
}

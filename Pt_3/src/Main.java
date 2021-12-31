import com.codewithme.generics.GenericList;
import com.codewithme.generics.Instructor;
import com.codewithme.generics.User;
import com.codewithme.generics.Utils;

public class Main {

    public static void main(String[] args) {
        var instructors = new GenericList<Instructor>();
        var users = new GenericList<User>();
        Utils.printUsers(instructors);
    }
}

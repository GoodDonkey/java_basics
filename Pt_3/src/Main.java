import com.codewithme.generics.GenericList;
import com.codewithme.generics.List;
import com.codewithme.generics.User;

public class Main {

    public static void main(String[] args) {
        GenericList<User> list = new GenericList<>();
        list.add(new User());
        User user = list.get(0);
    }
}

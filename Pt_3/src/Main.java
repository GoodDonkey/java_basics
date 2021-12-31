import com.codewithme.generics.User;
import com.codewithme.generics.Utils;

public class Main {

    public static void main(String[] args) {
        var max = Utils.max(new User(10), new User(20));
        System.out.println(max);
    }
}

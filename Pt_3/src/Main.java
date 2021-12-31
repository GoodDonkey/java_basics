import com.codewithme.generics.List;
import com.codewithme.generics.User;

public class Main {

    public static void main(String[] args) {
        var list = new List();
        list.add(1); // 컴파일러가 reference type으로 casting한다.
        list.add("1"); // Object를 받으므로 String도 가능
        list.add(new User()); // Object를 받으므로 User도 가능

        int number = (int)list.get(1);
    }
}

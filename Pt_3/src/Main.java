import com.codewithme.generics.GenericList;
import com.codewithme.generics.List;
import com.codewithme.generics.User;

public class Main {

    public static void main(String[] args) {

//        new GenericList<float>(); // Type argument cannot be of primitive type
        // int -> Integer
        // float -> Float
        // boolean -> Boolean 와 같이 reference type으로 정의해야 가능하다.

        GenericList<Integer> numbers = new GenericList<>();
        numbers.add(1); // Boxing: 컴파일러가 primitive type 값을 box에 담아 처리한다.
        int number = numbers.get(0); // Unboxing: 컴파일러가 box에 있는 int에서 꺼내온다.
    }
}

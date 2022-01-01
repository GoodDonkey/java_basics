import com.codewithme.generics.GenericList;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        var list = new GenericList<String>();
        Iterator<String> iterator = list.iterator();

        /* Iterator객체를 사용하기 떄문에 아래와 같은 메서드를 사용할 수 있다.
        * 이는 for each 문과 로직이 같다. */
        while (iterator.hasNext()) {
            String current = iterator.next();
            System.out.println(current);
        }

        for (var item : list)
            System.out.println(item);

    }
}

import com.codewithme.collections.Customer;
import com.codewithme.collections.EmailComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("b", "e3"));
        customers.add(new Customer("a", "e2"));
        customers.add(new Customer("c", "e1"));

        // Comparator 를 이용한 sort도 가능하다. email을 기준으로 정렬하게 된다.
        Collections.sort(customers, new EmailComparator());
        System.out.println(customers); // print 하기 위해서는 toString() 을 오버라이드 해야한다.
    }
}

import com.codewithme.collections.Customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("b"));
        customers.add(new Customer("a"));
        customers.add(new Customer("c"));

        // sort 하기 위해서는 Comparable interface를 implement 해야한다.
        Collections.sort(customers);
        System.out.println(customers); // print 하기 위해서는 toString() 을 오버라이드 해야한다.
    }
}

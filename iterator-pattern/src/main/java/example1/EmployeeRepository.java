package example1;

import java.util.Arrays;
import java.util.List;

public class EmployeeRepository implements Container {
    List<String> employees = Arrays.asList("Anand", "Baskaran", "Shatrughan", "Anil", "Ankit", "Vijay",
            "Nithya", "Akanksha");

    @Override
    public Iterator getIterator() {
        return new EmployeeIterator();
    }

    public class EmployeeIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index < employees.size();
        }

        @Override
        public Object next() {
            return this.hasNext() ? employees.get(index++) : null;
        }
    }
}

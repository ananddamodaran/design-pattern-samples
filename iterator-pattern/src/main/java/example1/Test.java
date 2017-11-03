package example1;

public class Test {
    public static void main(String[] args) {
        EmployeeRepository employees = new EmployeeRepository();
        for (Iterator it = employees.getIterator(); it.hasNext(); ) {
            String name = (String) it.next();
            System.out.println(name);
        }
    }
}

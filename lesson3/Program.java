package lesson3;

import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        Employee employee1 = new Employee("AAAA1", 33);
        Employee employee2 = new Employee("AAAA2", 34);
        Employee employee3 = new Employee("AAAA3", 35);

        Employee[] array1 = new Employee[3];
        array1[0] = employee1;
        array1[1] = employee2;
        array1[2] = employee3;

        //Arrays.sort(array1);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(new Employee("BBBBB", 34));
        list.addFirst(new Employee("CCCCCC", 23));
        list.addFirst(employee1);
        list.addFirst(new Employee("CCCCCC", 44));
        list.addFirst(new Employee("EEEEEE", 45));
        list.addFirst(new Employee("MMMMMMM", 66));
        list.addFirst(new Employee("MMMMMMM", 43));
        list.addFirst(new Employee("MMMMMMM", 21));
        list.addFirst(new Employee("MMMMMMM", 26));
        list.addFirst(new Employee("DDDDDDD", 41));


        LinkedList.Node node = list.contains(new Employee("BBBBB", 21));
        System.out.println(list);

        System.out.println();
        list.sort(new EmployeeComparator(SortType.Ascending));
        System.out.println(list);

        System.out.println();
        list.sort(new EmployeeComparator(SortType.Descending));
        System.out.println(list);

    }

}

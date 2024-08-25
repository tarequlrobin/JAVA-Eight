import java.util.*;

public class LambdaExpressionImpl {
    public static void main(String[] args) {
        Employee employee = () ->  "Hello World";
        System.out.println(employee.employeeName());

        Employee boss = () ->  "World";
        System.out.println(boss.employeeName());

        //Threading using Lambda
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello World " + i);
            }
        };
        Thread thread = new Thread(runnable);
        thread.run();

        //Comparator using Lambda
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(44);
        list.add(77);
        list.add(2);
        list.add(9);
        Collections.sort(list, (a,b) -> b-a);//Collections.reverseOrder());
        System.out.println(list);

        //Set
        Set<Integer> set = new TreeSet<>((a,b) -> (b-a));
        set.add(86);
        set.add(23);
        set.add(45);
        set.add(22);
        set.add(21);
        System.out.println(set);

        //Map
        Map<Integer, String> map = new TreeMap<>((a,b) -> (b-a));
        map.put(5, "Hello World");
        map.put(1, "Some World");
        map.put(2, " Any World");
        map.put(4, "All World");
        System.out.println(map);

        //Student class
        Student student1 = new Student(15, "John Smith");
        Student student2 = new Student(5, "Abul Smith");
        Student student3 = new Student(25, "Kabul Smith");

        List<Student> students = Arrays.asList(student1, student2, student3);
        students.sort((a,b) -> b.id - a.id);
        System.out.println(students);
    }
}

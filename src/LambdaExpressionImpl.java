import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
    }
}

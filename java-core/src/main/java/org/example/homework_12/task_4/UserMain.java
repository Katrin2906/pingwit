package org.example.homework_12.task_4;

import java.util.ArrayList;
import java.util.List;

public class UserMain {
    public static void main(String[] args) {
        List<String> users=new ArrayList<>();
        users.add("Nick");
        users.add("Alla");
        users.add("Mike");
        users.add("Penny");
        users.add("Emmy");
        System.out.println(users);

        // List newUsers -> List<User> newUsers, не стоит терять generic
        //   List newUsers = process(users, (User u) -> u.getName().equals("A")); // в задаче были имена на A,P,E -> List.of(A,P,E) и при помощи contains решаешься вопрос
    }
}

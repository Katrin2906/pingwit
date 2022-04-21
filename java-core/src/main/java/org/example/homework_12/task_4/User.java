package org.example.homework_12.task_4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // User - это класс сущности, в нем просто хранятся данные. Методы вроде process должны быть в отдельном классе
    public static List<User> process(List<String> users, Predicate<String> predicat) {
// users.removeIf(predicat) решает твою задачу
        // можно с использованием итератора, но создавать еще одну коллекцию смысла нету и код получает не оптимальным
        List<User> result = new ArrayList<User>();

        for (String user : users)

            if (predicat.test(user))

              //  result.add(user);

        return result;
// лишняя строка
  //  }


        return result;
    }
}

package org.example.homework_12.task_3;

//@FunctionalInterface - либо удаляй, либо убирай комментарий. Такого в коде быть не должно
public interface CreateUser { // CreateUser - это по сути глагол, такое название хорошо для метода, для класса необходимо использовать имя существительное, например CreateUserFunction
    User createUser(String name);
}

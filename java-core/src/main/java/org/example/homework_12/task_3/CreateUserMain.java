package org.example.homework_12.task_3;

// +
public class CreateUserMain {
    public static void main(String[] args) {
        CreateUser createUser = User::new;
        User lebovski = createUser.createUser("Big Lebovski");
        System.out.println(lebovski);
    }
}


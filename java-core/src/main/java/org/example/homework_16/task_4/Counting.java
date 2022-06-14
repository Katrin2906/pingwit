package org.example.homework_16.task_4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Counting {
    public static void main(String[] args) throws IOException, InterruptedException {
        List<Path> filesList = Files.walk(Paths.get(""))
                .filter(Files::isRegularFile)
                .toList();

        for (int i = 0; i < filesList.size(); ++i) {
            Thread thread = new Thread();
            thread.start();
            thread.join();
            
            /*
            Thread thread = new Thread();
            thread.start();
            thread.join();
            
            эти три строки запускают поток, который ничего не делает.
            Пример
            
          Runnable переменнаяКлассаRunnable = new КлассКоторыйИмплементируетRunnable();
          Thread thread = new Thread(переменнаяКлассаRunnable); // в конструктор передаем задачу, которая будет выполняться в отдельном потоке.
          thread.start();
          
          если после старта ты сразу вызовешь join, то main поток сразу остановится и будет ждать. 
          Получается ты потоки будешь запускать один за одним, а не все сразу.
          Необходимо у всех потоков нужных вызвать start(), а затем вызвать join тоже у всех потоков. 
          Для этого можно сложить все новые потоки в коллекцию или использовать какой-нибудь ExecutorService
            */

//            filesList.forEach(() -> filesList.con; //не совсем понимаю, почему не могу его тут вызвать
        }
    }
}

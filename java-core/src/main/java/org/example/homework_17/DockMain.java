package org.example.homework_17;

public class DockMain {
    private static final Integer BOAT_NUM=100;
    public static void main(String[] args) throws InterruptedException {

        for (int i=0;i<BOAT_NUM;++i){
            Thread thread=new Thread();
            thread.start();
            thread.join();
            Dock dock=new Dock();
            dock.work();
        }
    }
}

package org.example.homework_10.task_1;

public class FlowersGeneric<T> {

    private T petals;

    public FlowersGeneric(T petals) {
        this.petals = petals;
    }

    public T getPetals(T petals) {
        return petals;
    }

    // у тебя метод называется getName(), а возвращает по факту объект типа Class. Есть подозрение что твоя программа выкидывает java.lang.ClassCastException
    // чтобы это исправить надо заменить (T) getClass() на (T) getClass().getName(), но это не решит проблему, если вместо строки ты захочешь использовать Integer
    /*
    Этот метод лучше сделать вот так
    
    public String getName() {
        return getClass().getName();
    }
    */
    public String getName() {
        return  getClass().getName();
    }

    @Override
    public String toString() {
        return "FlowersGeneric{" +
                "petals=" + petals +
                '}';
    }
}

package org.example.homework_10.task_3;

// Тип Т - это марка будущего автомобиля, который будет хранится в гараже. Ниже положил тебе пример как мог выглядеть твой код
public class Garages<T> {

    private T auto;
    private T BMW; // BMW -> bmw
    private T Lada; // Lada -> lada - это не русский язык, где названия нужно писать с большой буквы
    private T name;

    Garages(T name) {
        this.name = name;
    }

    public T getAuto() {
        return auto;
    }

    public T getBMW() {
        return BMW;
    }

    public T getLada() {
        return Lada;
    }

    // у тебя метод называется compareBMW а выглядит как equals. Compare(сравнение) это про другое
    public String compareBMW(Garages auto, Garages auto1) {
        if (!(auto.getAuto().equals(getBMW()))) {
            return "В общий";
        } else return " ВMW";
    }

    // у тебя метод называется compareLada а выглядит как equals. Compare(сравнение) это про другое
    public String compareLada(Garages auto, Garages auto1) {
        if (!(auto.getAuto().equals(getLada()))) {
            return "В общий";
        } else return " Lada";
    }
    
    public static void main(String[] args) {
        Bmw[] bmws = {new Bmw("X5")};

     //   Garage<Bmw> garage = new Garage<>(bmws);

     //   garage.cars()[0] = new Bmw("X3");
        /*
        garage.cars()[0] = new Lada("Granta"); - этот код не будет компилироваться, т.к. в твоем гараже генериком указаны Bmw
        
        чтобы сделать гараж с Lada надо сделать так
        
        Bmw[] ladas = {new Lada("Granta")};

        Garage<Lada> ladaGarage = new Garage<>(ladas);

        */

     //   public void replaceFirst(T car) {
      //      cars[0] = car;
        }
    }

    record Bmw(String name) {

    }

    record Lada(String name) {

    }






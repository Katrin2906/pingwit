package org.example.homework_6.task_2;

public class CarMove {
    private Integer transmission;
    private Boolean engine;
    private Boolean accelerator;
    private Integer speed;
    public static final Integer MIN_TRANSMISSION = 0;
    public static final Integer MAX_TRANSMISSION = 7;
    public static final Integer TRANSMISSION_NUMBER = 20;
    public static final Integer TRANSMISSION_MOVE = 1;


    public CarMove(Integer transmission, Boolean engine, Boolean accelerator) {
        this.transmission = transmission;
        this.engine = engine;
        this.accelerator = accelerator;
    }

    public Integer SwitchAbove() {
        if (transmission < MAX_TRANSMISSION && transmission >= MIN_TRANSMISSION) {
            return (transmission++);
        } else {
            return null;
        }
    }

    public Integer SwitchBelow() {
        if (transmission <= MAX_TRANSMISSION && transmission > MIN_TRANSMISSION) {
            return (transmission--);
        } else {
            return null;
        }
    }

    public String BreakTransmission() {
        if (transmission < MIN_TRANSMISSION || transmission > MAX_TRANSMISSION) {
            return "C передачей что-то не то...Опять сломалась?";
        } else {
            return "Передача работает";
        }

    }

    public String Switch() {
        if (transmission.equals(MIN_TRANSMISSION)) {
            return "Не едет, передача не переключена";
        }
        return "Передача может быть понижена до " + SwitchBelow() + " или повышена до " + SwitchAbove();
    }

    public String EngineOff() {
        if (!engine) {
            return "Заглушен, мотор уже был заглушен";
        } else {
            return "Мотор заведен";
        }
    }

    public String EngineOn() {
        if (engine) {
            return "Мотор заведен, уже был заведен";
        } else {
            return "Мотор заглушен";
        }
    }

    public String AcceleratorPress() {
        if (accelerator) {
            return "Педаль газа в пол!";
        } else {
            return "Не едет, педаль газа не нажата";
        }
    }

    public Integer SpeedValue() {
        if (transmission <= MAX_TRANSMISSION && transmission >= MIN_TRANSMISSION) {
            speed = transmission * TRANSMISSION_NUMBER;
            return speed;
        } else {
            return null;
        }
    }

    public String CarMove() {
        if (transmission < TRANSMISSION_MOVE || transmission > MAX_TRANSMISSION || !engine || !accelerator) {
            return "Не поедет, что-то не работает...";
        } else {
            return "Поехали!";
        }
    }

    public String CarMoveRightNow() {
        if (transmission > TRANSMISSION_MOVE && transmission <= MAX_TRANSMISSION && engine && accelerator) {
            return "Машина уже в пути! Скорость движения сейчас " + SpeedValue() + "км/час";
        } else {
            return "Совсем не поедет ((";
        }
    }

    @Override
    public String toString() {
        return "CarMove{" +
                "Transmission=" + transmission +
                ", Engine=" + engine +
                ", Speed=" + speed +
                ", Accelerator=" + accelerator +
                '}';
    }
}

package org.example.homework_12.task_5;

import java.util.Map;
import java.util.Objects;

public class Sportsmen {

    private String name;
    private Integer speed;
    private Integer competition_id; // competition_id -> competitionId
    private String medal; // в задании сказано, что это должны быть коллекция (List/Map здесь по желанию)

    public Sportsmen(String name, Integer speed, Map<Integer, String> medals) {
        // Map<Integer, String> medals забыла про медали
        this.name = name;
        this.speed = speed;
    }

    public Integer getSpeed() {
        return speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sportsmen sportsmen = (Sportsmen) o;
        return Objects.equals(name, sportsmen.name) && Objects.equals(speed, sportsmen.speed) && Objects.equals(competition_id, sportsmen.competition_id) && Objects.equals(medal, sportsmen.medal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, speed, competition_id, medal);
    }

    @Override
    public String toString() {
        return "Sportsmen{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", competition_id=" + competition_id +
                ", medal='" + medal + '\'' +
                '}';
    }
}

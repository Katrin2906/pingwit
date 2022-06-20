package pingwit.homework_29.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private List<Tonometr> tonometrs = new ArrayList<>(); // абзац
    public Order(Long id, List<Tonometr> tonometrs) { // т.к. это @Entity, то должен быть конструктор без аргументов
        this.id = id;
        this.tonometrs = tonometrs;
    }

    public Order() {

    }

    public Long getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public List<Tonometr> getTonometrs() {
        return tonometrs;
    }

    public void setTonometrs(List<Tonometr> tonometrs) {
        this.tonometrs = tonometrs;
    }
}

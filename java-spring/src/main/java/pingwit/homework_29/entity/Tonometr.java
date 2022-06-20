package pingwit.homework_29.entity;

import javax.persistence.*;

@Entity
public class Tonometr {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String producer;
    private Integer modelNumber;

    public Tonometr(Long id, String producer, Integer modelNumber) { // т.к. это @Entity, то должен быть конструктор без аргументов
        this.id = id;
        this.producer = producer;
        this.modelNumber = modelNumber;
    }

    public Tonometr() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Integer getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(Integer modelNumber) {
        this.modelNumber = modelNumber;
    }
}

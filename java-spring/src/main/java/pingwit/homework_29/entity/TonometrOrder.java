package pingwit.homework_29.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class TonometrOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    public TonometrOrder(Long id, List<Tonometr> tonometrs) {
        this.id = id;
    }

    public TonometrOrder() {

    }

    public Long getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

}

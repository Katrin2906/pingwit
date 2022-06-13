package pingwit.homework_26.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import pingwit.homework_26.entity.Milk;

import java.util.List;
import java.util.Set;

public interface MilkRepository extends CrudRepository<Milk, Long> {

    List<Milk> findAll();

    @Modifying
    @Query("UPDATE Milk m SET m.fatPercent=?1, m.volume=?2 WHERE m.id=?3")
    void setFatPercentAndVolume(Double fatPercent, Double volume, Long id);

    @Query("SELECT m FROM Milk m LEFT JOIN FETCH m.milkProducers WHERE m.id IN :ids")
    Set<Milk> getMilkByIdIn(List<Long> ids);

    @EntityGraph(attributePaths = {"milkProducers"})
    List<Milk> findAllByIdIn(List<Long> ids);


}

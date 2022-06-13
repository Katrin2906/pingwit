package pingwit.homework_26.repository;


import org.springframework.stereotype.Repository;
import pingwit.homework_26.dto.MilkDto;
import pingwit.homework_26.entity.Milk;
import pingwit.homework_26.service.MilkConverter;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class MilkSearchRepository {

    private final EntityManager entityManager;
    private final MilkConverter milkConverter;

    public MilkSearchRepository(EntityManager entityManager, MilkConverter milkConverter) {
        this.entityManager = entityManager;
        this.milkConverter = milkConverter;
    }

    public List<MilkDto> getMilkByIdIn(List<Long> ids) {
        TypedQuery<Milk> query = entityManager.createQuery(
                """
                        SELECT m FROM Milk m
                        LEFT JOIN FETCH m.milkProducers
                        WHERE m.id IN :ids
                            """, Milk.class
        );

        query.setParameter("ids", ids);

        return query.getResultList().stream()
                .map(milkConverter::toFront)
                .toList();
    }
}

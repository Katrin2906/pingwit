package pingwit.homework_26.service;

import org.springframework.stereotype.Component;
import pingwit.homework_26.dto.MilkProducerDto;
import pingwit.homework_26.entity.Milk;
import pingwit.homework_26.entity.MilkProducer;

import java.util.List;

@Component
public class MilkProducerConverter {
    public List<MilkProducer> toLocal(Milk milk, List<MilkProducerDto> milkProducers) {
        if (milkProducers == null) {
            return null;
        }

        return milkProducers.stream()
                .map(dto -> toLocal(dto, milk))
                .toList();
    }

    public MilkProducer toLocal(MilkProducerDto dto, Milk milk) {
        MilkProducer milkProducer = new MilkProducer();

        milkProducer.setId(dto.id());
        milkProducer.setName(dto.name());
        milkProducer.setMilk(milk);

        return milkProducer;
    }

    public List<MilkProducerDto> toFront(List<MilkProducer> milkProducers) {
        if (milkProducers == null) {
            return null;
        }

        return milkProducers.stream()
                .map(this::toFront)
                .toList();
    }

    public MilkProducerDto toFront(MilkProducer milkProducer) {
        return new MilkProducerDto(milkProducer.getId(), milkProducer.getName());
    }

}

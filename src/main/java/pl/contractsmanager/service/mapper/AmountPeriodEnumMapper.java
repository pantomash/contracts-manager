package pl.contractsmanager.service.mapper;

import org.mapstruct.Mapper;
import pl.contractsmanager.data.model.AmountPeriodEnum;
import pl.contractsmanager.exception.ValidationException;

import java.util.stream.Stream;

@Mapper(componentModel = "spring")
public class AmountPeriodEnumMapper {
    public String map(AmountPeriodEnum amountPeriodEnum) { return amountPeriodEnum.getValue(); }

    public AmountPeriodEnum map(String amountPeriodEnum) {
        return Stream.of(AmountPeriodEnum.values()).filter(element -> element.getValue().equals(amountPeriodEnum))
                .findFirst().orElseThrow(() -> new ValidationException());
    }
}

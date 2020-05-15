package pl.contractsmanager.service.mapper;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import pl.contractsmanager.data.model.Contract;
import pl.contractsmanager.service.dto.ContractDto;

import java.util.Set;

@Mapper(uses = {SystemMapper.class, AmountPeriodEnumMapper.class}, componentModel = "spring")
public interface ContractMapper {
    @IterableMapping(qualifiedByName = "mapToContractDto")
    Set<ContractDto> mapToContractDtos(Set<Contract> contracts);

    ContractDto mapToContractDto(Contract contract);

    Contract mapToContract(ContractDto contractDto);
}

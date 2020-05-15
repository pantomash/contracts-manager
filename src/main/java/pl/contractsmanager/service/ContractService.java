package pl.contractsmanager.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.contractsmanager.data.repository.ContractRepository;
import pl.contractsmanager.service.dto.ContractDto;
import pl.contractsmanager.service.mapper.ContractMapper;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ContractService {
    private final ContractRepository contractRepository;
    private final ContractMapper contractMapper;

    public Collection<ContractDto> findFiltered() {
        return contractRepository
                .findAll()
                .stream()
                .filter(contract -> contract.getActive())
                .map(contractMapper::mapToContractDto)
                .collect(Collectors.toSet());
    }

    public Collection<ContractDto> findAll() {
        return contractRepository
                .findAll()
                .stream()
                .map(contractMapper::mapToContractDto)
                .collect(Collectors.toSet());
    }
}

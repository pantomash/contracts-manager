package pl.contractsmanager.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.contractsmanager.data.repository.SystemRepository;
import pl.contractsmanager.service.dto.SystemDto;
import pl.contractsmanager.service.mapper.SystemMapper;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class SystemService {
    private final SystemRepository systemRepository;
    private final SystemMapper systemMapper;

    public Collection<SystemDto> findAll() {
        return systemRepository.findAll().stream()
                .map(systemMapper::mapToSystemDto)
                .collect(Collectors.toSet());
    }
}

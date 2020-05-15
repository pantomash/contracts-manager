package pl.contractsmanager.service.mapper;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import pl.contractsmanager.data.model.System;
import pl.contractsmanager.service.dto.SystemDto;

import java.util.Set;

@Mapper(componentModel = "spring")
public interface SystemMapper {
    @IterableMapping(qualifiedByName = "mapToSystemDto")
    Set<SystemDto> mapToSystemDtos(Set<System> systems);

    SystemDto mapToSystemDto(System system);

    System mapToSystem(SystemDto systemDto);
}

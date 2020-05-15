package pl.contractsmanager.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.contractsmanager.service.ContractService;
import pl.contractsmanager.service.dto.ContractDto;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/contract")
public class ContractController {
    private ContractService contractService;

    @GetMapping(value = "/all")
    public Collection<ContractDto> findAll() {
        return contractService.findAll();
    }

    @GetMapping(value = "/filtered")
    public Collection<ContractDto> findFiltered() {
        return contractService.findFiltered();
    }
}

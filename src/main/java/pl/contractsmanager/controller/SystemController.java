package pl.contractsmanager.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.contractsmanager.service.SystemService;
import pl.contractsmanager.service.dto.SystemDto;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/system")
public class SystemController {
    private final SystemService systemService;

    @GetMapping
    public Collection<SystemDto> findAll() {
        return systemService.findAll();
        // TO DO odwołanie do ModelAndView

    }
}

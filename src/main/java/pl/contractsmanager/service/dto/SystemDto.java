package pl.contractsmanager.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class SystemDto {
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String description;
    @NotNull
    private String owner;
}

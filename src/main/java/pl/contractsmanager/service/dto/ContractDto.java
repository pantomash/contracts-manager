package pl.contractsmanager.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.contractsmanager.data.model.AmountPeriodEnum;
import pl.contractsmanager.data.model.AmountTypeEnum;
import pl.contractsmanager.data.model.System;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ContractDto {
    private Long id;
    @NotNull
    private Long contractNumber;
    @NotNull
    private System system;
    private LocalDateTime fromDate;
    private LocalDateTime toDate;
    private Long amount;
    private AmountTypeEnum amountType;
    private AmountPeriodEnum amountPeriod;
    private Boolean active;
}

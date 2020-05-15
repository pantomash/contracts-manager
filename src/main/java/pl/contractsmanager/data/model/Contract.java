package pl.contractsmanager.data.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Contract {
    private Long id;
    private Long contractNumber;
    private System system;
    private LocalDateTime fromDate;
    private LocalDateTime toDate;
    private Long amount;
    private AmountTypeEnum amountType;
    private AmountPeriodEnum amountPeriod;
    private Boolean active;
}

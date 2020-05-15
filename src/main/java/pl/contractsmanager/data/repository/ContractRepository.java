package pl.contractsmanager.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.contractsmanager.data.model.Contract;

public interface ContractRepository extends JpaRepository<Contract, Long> {
}

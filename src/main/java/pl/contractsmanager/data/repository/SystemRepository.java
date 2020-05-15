package pl.contractsmanager.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.contractsmanager.data.model.System;

public interface SystemRepository extends JpaRepository<System, Long> {
}

package io.github.bonfimalan.dsmeta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.bonfimalan.dsmeta.entity.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
  
}

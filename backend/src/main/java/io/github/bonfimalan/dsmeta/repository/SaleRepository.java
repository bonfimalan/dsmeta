package io.github.bonfimalan.dsmeta.repository;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import io.github.bonfimalan.dsmeta.entity.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
  @Query ("SELECT obj FROM Sale obj WHERE obj.date BETWEEN :min and :max ORDER BY obj.amount DESC")
  Page<Sale> findSales(LocalDate min, LocalDate max, Pageable pageable);
}

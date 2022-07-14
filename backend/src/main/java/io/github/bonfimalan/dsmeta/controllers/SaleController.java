package io.github.bonfimalan.dsmeta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.bonfimalan.dsmeta.entity.Sale;
import io.github.bonfimalan.dsmeta.services.SaleService;

@RestController
@RequestMapping("/sales")
public class SaleController {
  @Autowired
  private SaleService service;

  @GetMapping
  public List<Sale> findSales() {
    return service.findSales();
  }
}

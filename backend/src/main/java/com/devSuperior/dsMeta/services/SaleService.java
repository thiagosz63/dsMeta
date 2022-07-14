package com.devSuperior.dsMeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devSuperior.dsMeta.entities.Sale;
import com.devSuperior.dsMeta.repositories.SaleRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;

	public List<Sale> findSales() {
		return repository.findAll();

	}

}

package com.sesi.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.projeto.entities.Pagamento;

public interface PagamentoRepository extends JpaRepository<Long, Pagamento> {

}

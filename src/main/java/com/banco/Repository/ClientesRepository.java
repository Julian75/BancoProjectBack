package com.banco.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banco.Entity.Clientes;

public interface ClientesRepository extends JpaRepository<Clientes, Long> {

}

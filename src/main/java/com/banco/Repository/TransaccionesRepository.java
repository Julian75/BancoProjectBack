package com.banco.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banco.Entity.Transacciones;

public interface TransaccionesRepository extends JpaRepository<Transacciones, Long> {

}

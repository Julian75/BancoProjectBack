package com.banco.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banco.Entity.Productos;

public interface ProductosRepository extends JpaRepository<Productos, Long>{

}

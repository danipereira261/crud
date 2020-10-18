package com.example.demo.repositorio;


import com.example.demo.modelo.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {
}
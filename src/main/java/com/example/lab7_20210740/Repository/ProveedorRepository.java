package com.example.lab7_20210740.Repository;

import com.example.lab7_20210740.Entity.Proovedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorRepository extends JpaRepository<Proovedor, Integer> {
}

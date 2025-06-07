package com.example.lab7_20210740.Controller;

import com.example.lab7_20210740.Entity.Proovedor;
import com.example.lab7_20210740.Repository.ProveedorRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/proveedor")
public class ProveedorController {

    final ProveedorRepository proveedorRepository;

    public ProveedorController(ProveedorRepository proveedorRepository) {
        this.proveedorRepository = proveedorRepository;
    }

    //Listado
   @GetMapping("/lista")
   public List<Proovedor> lista(){
        return proveedorRepository.findAll();
   }

   //proovedor por su id
   @GetMapping("/{id}")
    public Proovedor buscar(@PathVariable Integer id){
        return proveedorRepository.findById(id).get();
   }

   //registro proveedores






}

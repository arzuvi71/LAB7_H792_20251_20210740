package com.example.lab7_20210740.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name="proveedores")
public class Proovedor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idproveedores", nullable = false)
    private Integer idproveedores;
    @Column(name = "razon_social", nullable = false)
    private String razonSocial;
    @Column(name = "nombre_comercial", nullable = false)
    private String nombreComercial;
    @Column(name = "ruc", nullable = false)
    private Integer ruc;
    @Column(name = "telefono", nullable = false)
    private String telefono;
    @Column(name = "correo", nullable = false)
    private String correo;
    @Column(name = "url_web", nullable = false)
    private String urlWeb;
    @Column(name = "direccion", nullable = false)
    private String direccion;
    @Column(name = "pais", nullable = false)
    private String pais;
    @Column(name = "representante_legal", nullable = false)
    private String representanteLegal;
    @Column(name = "dni_representante", nullable = false)
    private Integer dniRepresentante;
    @Column(name = "tipo_proveedor", nullable = false)
    private String tipoProveedor;
    @Column(name = "categoria", nullable = false)
    private String categoria;
    @Column(name = "facturacion_anual", nullable = false)
    private Double facturacionAnual;
    @Column(name = "fecha_registro", nullable = false)
    private LocalDateTime fechaRegistro;
    @Column(name = "ultima_actualizacion", nullable = false)
    private LocalDateTime ultimaActualizacion;
    @Column(name = "estado", nullable = false)
    private Boolean estado;


}

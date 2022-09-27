package com.salesForce.entity;

import com.salesForce.Enums.RolName;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@Getter
@Setter
@Table (name = "employee")
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_employee", nullable = false)
    private Long id_employee;

    @Column(name = "name")
    private String nombreEmpleado;

    @Column(name = "emailEmpleado")
    private String emailEmpleado;

    @Column (name = "id_enterprise")
    private Long id_enterprise;

    @Column(name = "role")
    private RolName role;

    @Column(name = "password")
    private String password;

    @Column(name = "createdAt")
    private Date createdAt;

    @Column(name = "updatedAt")
    private Date updatedAt;

    public Employee() {
    }

    public Employee(String nombreEmpleado, String emailEmpleado, RolName role, String password, Date createdAt, Date updatedAt) {
        this.nombreEmpleado = nombreEmpleado;
        this.emailEmpleado = emailEmpleado;
        this.role = role;
        this.password = password;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;



    }

    public Long getId_employee() {
        return id_employee;
    }

    public void setId_employee(Long id_employee) {
        this.id_employee = id_employee;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getEmailEmpleado() {
        return emailEmpleado;
    }

    public void setEmailEmpleado(String emailEmpleado) {
        this.emailEmpleado = emailEmpleado;
    }

    public Long getId_enterprise() {
        return id_enterprise;
    }

    public void setId_enterprise(Long id_enterprise) {
        this.id_enterprise = id_enterprise;
    }

    public RolName getRole() {
        return role;
    }

    public void setRole(RolName role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}

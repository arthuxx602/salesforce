package com.salesForce.repository;

import com.salesForce.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee,Long> {
    @Query(value="SELECT * FROM empleado where id_enterprise= ?1", nativeQuery=true)
    public abstract ArrayList<Employee> findByEmpresa(Long id);
}

package com.javateam.medicalcenter.repository;

import com.javateam.medicalcenter.entity.Doctor;
import com.javateam.medicalcenter.entity.Employee;
import com.javateam.medicalcenter.entity.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{


    Iterable<Employee> findById(Employee employee);
    Iterable<Employee> findByName(Employee employee);


}

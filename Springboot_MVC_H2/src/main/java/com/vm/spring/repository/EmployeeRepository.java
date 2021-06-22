package com.vm.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.vm.spring.entity.*;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
 
}
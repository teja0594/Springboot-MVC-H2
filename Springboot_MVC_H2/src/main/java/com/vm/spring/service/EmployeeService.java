package com.vm.spring.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vm.spring.repository.*;
import com.vm.spring.entity.*;

/**
 * @author KedariTeja
 *
 */
@Service
public class EmployeeService {
 
 @Autowired
 private EmployeeRepository employeeRepository;
 
 public void setEmployeeRepository(EmployeeRepository employeeRepository) {
  this.employeeRepository = employeeRepository;
 }
  
 public List<Employee> retrieveEmployees() {
  List<Employee> employees = employeeRepository.findAll();
  return employees;
 }
  
 public Employee getEmployee(Long employeeId) {
  Optional<Employee> optEmp = employeeRepository.findById(employeeId);
  return optEmp.get();
 }
  
 public void saveEmployee(Employee employee){
  employeeRepository.save(employee);
 }
  
 public void deleteEmployee(Long employeeId){
  employeeRepository.deleteById(employeeId);
 }
  
 public void updateEmployee(Employee employee) {
  employeeRepository.save(employee);
 }
}
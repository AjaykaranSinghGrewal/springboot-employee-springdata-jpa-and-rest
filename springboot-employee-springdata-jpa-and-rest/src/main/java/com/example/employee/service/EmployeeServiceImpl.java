// this class is no longer required because we added springdata-rest dependency to the pom file
//the dependency brings in all the below listed methods itself


//package com.example.employee.service;
//
//import java.util.List; import java.util.Optional;
//
//import org.springframework.stereotype.Service;
//
//import com.example.employee.entity.Employee; import
//com.example.employee.repository.EmployeeRepository;
//
//@Service 
//public class EmployeeServiceImpl implements EmployeeService{
//
//private EmployeeRepository employeeRepository;
//
//public EmployeeServiceImpl(EmployeeRepository employeeRepository) { 
//	super();
//	this.employeeRepository = employeeRepository; 
//}
//
//@Override 
//public List<Employee> findAll() { 
//	//delegate the call to DAO return
//	return employeeRepository.findAll(); 
//}
//
//@Override 
//public Employee findById(int theId) { 
//	Optional<Employee> result =
//			employeeRepository.findById(theId); Employee theEmployee = null;
//
////check if employye is present 
//	if (result.isPresent()) 
//	{ 
//		theEmployee = result.get(); 
//	} else { 
//		throw new RuntimeException("Did not find employee with id " +theId); 
//	} 
//return theEmployee; 
//}
//
//@Override 
//public Employee save(Employee theEmployee) { return
//employeeRepository.save(theEmployee); }
//
//@Override 
//public void deleteById(int theId) {
//	employeeRepository.deleteById(theId); 
//}
//
//
//}
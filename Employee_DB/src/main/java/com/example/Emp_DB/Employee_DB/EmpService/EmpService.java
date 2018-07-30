package com.example.Emp_DB.Employee_DB.EmpService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Emp_DB.Employee_DB.EmpRepository.EmpRepository;
import com.example.Emp_DB.Employee_DB.Model.Employee;

@RestController
@RequestMapping("/rest/emp")
public class EmpService {

	@Autowired
	private EmpRepository emprepository;
	
	@GetMapping(value="/all")
	public List<Employee> getAllEmployee(){
		return emprepository.findAll() ;
	}
	
	@PostMapping(value="/add")
	public List<Employee> addEmployee(@RequestBody Employee emp){
		 emprepository.save(emp);
		 return emprepository.findAll();
	}
	
	@PutMapping(value="/update/{id}")	
	public List<Employee> updateEmployee(@RequestBody Employee emp ,@PathVariable int id){
		 emprepository.save(emp);
		 return emprepository.findAll();
	}
	
	@DeleteMapping(value="/remove/{id}")
	public void deleteEmployee(@PathVariable int id) {
			 emprepository.deleteById(id);
	}
	
	
	
}

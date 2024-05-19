package in.debjitpan.postgreSqlmultitenancy.controller;

import in.debjitpan.postgreSqlmultitenancy.domain.Employee;
import in.debjitpan.postgreSqlmultitenancy.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<Employee>> getEmployees() {
        return new ResponseEntity<>(employeeService.getEmployees(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Employee> create(@RequestBody Employee employee) {
        return new ResponseEntity<>(employeeService.save(employee), HttpStatus.CREATED);
    }


}

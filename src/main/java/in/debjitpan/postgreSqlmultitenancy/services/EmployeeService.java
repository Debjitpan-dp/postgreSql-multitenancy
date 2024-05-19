package in.debjitpan.postgreSqlmultitenancy.services;

import in.debjitpan.postgreSqlmultitenancy.domain.Employee;
import in.debjitpan.postgreSqlmultitenancy.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getEmployees(){
        return employeeRepository.findAll();
    }

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }
}

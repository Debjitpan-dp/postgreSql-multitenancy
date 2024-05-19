package in.debjitpan.postgreSqlmultitenancy.repository;

import in.debjitpan.postgreSqlmultitenancy.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

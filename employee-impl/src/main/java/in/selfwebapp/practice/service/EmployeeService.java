package in.selfwebapp.practice.service;

import in.selfwebapp.practice.api.EmployeeApi;
import in.selfwebapp.practice.beans.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in.selfwebapp.practice.repository.EmployeeRepository;

import java.util.List;

/**
 * Created by shailendra.singh on 2/26/17.
 *
 */
@Service
public class EmployeeService implements EmployeeApi {

    @Autowired
    private EmployeeRepository employeeRepository;


    public List<Employee> getAll() {
        return employeeRepository.getAll();
    }
}

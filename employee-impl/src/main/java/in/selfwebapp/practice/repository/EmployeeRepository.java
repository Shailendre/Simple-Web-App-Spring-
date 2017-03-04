package in.selfwebapp.practice.repository;

import in.selfwebapp.practice.beans.Employee;

import java.util.List;

/**
 * Created by shailendra.singh on 2/26/17.
 *
 */
public interface EmployeeRepository {

    List<Employee> getAll();

}

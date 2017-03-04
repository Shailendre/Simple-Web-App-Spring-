package in.selfwebapp.practice.repositoryImpl;

import in.selfwebapp.practice.beans.Employee;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import in.selfwebapp.practice.repository.EmployeeRepository;

import java.io.IOException;
import java.util.List;

/**
 * Created by shailendra.singh on 2/26/17.
 *
 */
@Component
public class EmployeeRepositoryImpl implements EmployeeRepository {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private static final String FETCH_ALL_EMPLOYEES = "SELECT * FROM experimental_schema.DATA";

    public List<Employee> getAll() {
        return namedParameterJdbcTemplate.query(FETCH_ALL_EMPLOYEES, new BeanPropertyRowMapper(Employee.class));
    }
}

package in.selfwebapp.practice.api;

import in.selfwebapp.practice.beans.Employee;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

/**
 * Created by shailendra.singh on 2/26/17.
 *
 */
@Path("/empl")
public interface EmployeeApi {

    @GET
    @Path("/")
    @Produces("application/json")
    List<Employee> getAll();
}

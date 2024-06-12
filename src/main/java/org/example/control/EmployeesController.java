package org.example.control;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import org.example.DAO.EmployeesDAO;
//import org.example.dao.EmployeeDAO;
import org.example.Exceptions.DataNotFoundException;
import org.example.FilterDTO.EmployeeFilterDto;
import org.example.Mappers.EmployeesMapper;
import org.example.dto.EmployeesDTO;
import org.example.models.Employee;

import java.net.URI;
import java.sql.SQLException;
import java.util.ArrayList;

@Path("/employees")
public class EmployeesController {
    EmployeesDAO dao = new EmployeesDAO();
    @Context
    UriInfo uriInfo;
    @Context
    HttpHeaders headers;

    @GET
    public Response SELECT_ALL_EMPLOYEES(
            @BeanParam EmployeeFilterDto filter) {
        try {
            GenericEntity<ArrayList<Employee>> employees = new GenericEntity<ArrayList<Employee>>(dao.SELECT_ALL_EMPLOYEES(filter)) {
            };
            if (headers.getAcceptableMediaTypes().contains(MediaType.valueOf(MediaType.APPLICATION_XML))) {
                return Response
                        .ok(employees)
                        .type(MediaType.APPLICATION_XML)
                        .build();
            }
            return Response
                    .ok(employees, MediaType.APPLICATION_XML)
                    .build();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GET
    @Path("{employeeId}")
    public Response selectEmployee(@PathParam("employeeId") int employeeId) throws SQLException {
        try {
            Employee employee = dao.selectEmployee(employeeId);
            if (employee == null) {
                throw new DataNotFoundException("emploees" + employeeId + "notfound");
            }

            EmployeesDTO dto = EmployeesMapper.INSTANCE.toDeptDto(employee);
            addLinks(dto);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return Response
                .ok(employeeId)
                .type(MediaType.APPLICATION_JSON)
                .build();
    }

    private void addLinks(EmployeesDTO dto) {
        URI selfUri = uriInfo.getAbsolutePath();
        URI empUri = uriInfo.getAbsolutePathBuilder()
                .path(EmployeesController.class).build();

        dto.addlink(selfUri.toString(), "self");
        dto.addlink(empUri.toString(), "employees");

    }


    @DELETE
    @Path("{employeeId}")
    public Response deleteEmployee(@PathParam("employeeId") int employeeId) {
        try {
            dao.DELETE_EMPLOYEES(employeeId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return Response
                .ok(employeeId)
                .type(MediaType.APPLICATION_JSON)
                .build();
    }

    @POST
    public Response INSERT_EMPLOYEES(Employee employee) {
        try {
            dao.INSERT_EMPLOYEES(employee);
            NewCookie cookie = (new NewCookie.Builder("username")).value("OOOOO").build();
            URI uri = uriInfo.getAbsolutePathBuilder().path(employee.getEmployee_id() + "").build();
            return Response
                    .created(uri)
                    .cookie(cookie)
                    .header("Created by", "wijdan")
                    .build();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PUT
    @Path("{employeeId}")
    public Response UPDATE_EMPLOYEE(@PathParam("employeeId") int employeeId, Employee employee) {
        try {
            employee.setEmployee_id(employeeId);
            dao.UPDATE_EMPLOYEE(employee);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return Response
                .ok(employee)
                .type(MediaType.APPLICATION_JSON)
                .build();
    }
}
package org.example.DAO;
import org.example.FilterDTO.EmployeeFilterDto;
import org.example.models.Employee;
import java.sql.*;
import java.util.ArrayList;

public class EmployeesDAO {
    private static final String URL = "jdbc:sqlite:C:\\Users\\dev\\Downloads\\hr.db";
    private static final String SELECT_ALL_EMPLOYEES = "select * from employees";
    private static final String SELECT_ONE_EMPLOYEES = "select * from employees where employee_id = ?";
    private static final String SELECT_EMP_WITH_HIRE_YEAR = "select * from employees where hire_date like ? || '%'";
    private static final String SELECT_EMP_WITH_JOB_ID = "select * from employees where job_id = ?";
    private static final String INSERT_EMPLOYEES = "insert into employees values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    //private static final String UPDATE_Employee = "update employees set salary = ?, manager_id = ?, department_id = ? where employee_id = ?";
    private static final String UPDATE_EMPLOYEE = "update employees set first_name = ?, last_name = ?, email = ? , phone_number = ? , hire_date = ? , job_id = ? , salary = ? , manager_id = ? , department_id = ?  where employee_id = ?";
    private static final String DELETE_EMPLOYEES = "delete from employees where employee_id = ?";


    public ArrayList<Employee> selectAllEmployees() throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(SELECT_ALL_EMPLOYEES);

        ResultSet rs = st.executeQuery();
        ArrayList<Employee> employees = new ArrayList<>();

        while (rs.next()) {
            employees.add(new Employee(rs));
        }

        return employees;
    }
    public ArrayList<Employee> SELECT_ALL_EMPLOYEES(EmployeeFilterDto filter) throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st;
        if (filter.getJob_id() != null) {
            st = conn.prepareStatement(SELECT_EMP_WITH_JOB_ID);
            st.setInt(1, filter.getJob_id());
        }
        else if(filter.getHire_date() != null) {
            st = conn.prepareStatement(SELECT_EMP_WITH_HIRE_YEAR);
            st.setString(1, filter.getHire_date());

        }
        else {
            st = conn.prepareStatement(SELECT_ALL_EMPLOYEES);
        }
        ResultSet rs = st.executeQuery();
        ArrayList<Employee> employees = new ArrayList<>();
        while (rs.next()) {
            employees.add(new Employee(rs));
        }

        return employees;
    }
    public Employee selectEmployee(int id) throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(SELECT_ONE_EMPLOYEES);

        st.setInt(1, id);

        ResultSet rs = st.executeQuery();

        if(rs.next()) {
            return new Employee(rs);
        }
        else {
            return null;
        }

    }

    public void INSERT_EMPLOYEES(Employee employee) throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(INSERT_EMPLOYEES);

        st.setInt(1, employee.getEmployee_id());
        st.setString(2, employee.getFirst_name());
        st.setString(3, employee.getLast_name());
        st.setString(4, employee.getEmail());
        st.setString(5, employee.getPhone_number());
        st.setString(6, employee.getHire_date());
        st.setInt(7, employee.getJob_id());
        st.setDouble(8, employee.getSalary());
        st.setInt(9, employee.getManager_id());
        st.setInt(10, employee.getDepartment_id());

        st.executeUpdate();
    }

    public void UPDATE_EMPLOYEE(Employee employee) throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(UPDATE_EMPLOYEE);

        st.setInt(1, employee.getEmployee_id());
        st.setString(2, employee.getFirst_name());
        st.setString(3, employee.getLast_name());
        st.setString(4, employee.getEmail());
        st.setString(5, employee.getPhone_number());
        st.setString(6, employee.getHire_date());
        st.setInt(7, employee.getJob_id());
        st.setDouble(8, employee.getSalary());
        st.setInt(9, employee.getManager_id());
        st.setInt(10, employee.getDepartment_id());

        st.executeUpdate();
    }

    public void DELETE_EMPLOYEES(int id) throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(DELETE_EMPLOYEES);

        st.setInt(1, id);
        st.executeUpdate();
    }
}

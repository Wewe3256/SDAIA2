package org.example.models;

//import org.example.DAO.dbhwemployy;

import java.sql.*;
import java.util.ArrayList;

public class dbDAOEMPLOYEeS {

    //private static final String URL = "jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\untitled1\\hr.db";
    //private static final String SELECT_ALL_EMP = "select * from employees";
    //private static final String SELECT_ONE_EMP = "select * from employees where employee_id = ?";
    //????? تمثل قيمة اي attribiut وكان ممكن احط employees id =?
    //private static final String INSERT_EMP = "insert into employees values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    //private static final String UPDATE_EMP= "update employees set job_id = ?, manger_id = ?,department_id = ?,salary = ?,first_name =?,last_name = ?,email = ?,phone_number = ?,hire_date = ? where employee_id = ?";
    //private static final String DELETE_EMP = "delete from employees where employee_id = ?";

    //public void insertEMP(dbhwemployy d) throws SQLException, ClassNotFoundException {
      // Class.forName("org.sqlite.JDBC");
       // why??????//????
       // Connection conn = DriverManager.getConnection(URL);
       // PreparedStatement st = conn.prepareStatement(INSERT_EMP);
        //لاني ما اقدر اوصل للميثود لانها في كلاس اخر لذلك استخدمت get()
        //set تسمح لي اوصل واعدل على البيانات
        //  استخدم النوع void للميثود يلي مافيها return بمعنى لاترجع قيمه
        // النوع void  يستخدم للتعديل والحذف او الاضافة حيث لا ارجع قيم بل اضيف قيم
        // بمعنى ان تكون الدالة لاترجع لي اي قيمة ولا استخدمها لعرض شيء
        ////////////// PreparedStatement
        // عندما اتعامل مع جملsQL  تحتوي على متغيرات ?,?,?
        //st.setInt(1,d.getEmployee_id());
        //st.setInt(7,d.getJob_id());
        //st.setInt(9,d.getManger_id());
        //st.setInt(10,d.getDepartment_id());
        //st.setDouble(8,d.getSalary());
        //st.setString(2,d.getFirst_name());
        //st.setString(3,d.getLast_name());
        //st.setString(4,d.getEmail());
       // st.setString(5,d.getPhone_number());
        //st.setString(6,d.getHire_date());
       // st.executeUpdate();
   // }

    //public void updateEmp( dbhwemployy d) throws SQLException, ClassNotFoundException {
       // Class.forName("org.sqlite.JDBC");
       // Connection conn = DriverManager.getConnection(URL);
        //PreparedStatement st = conn.prepareStatement(UPDATE_EMP);
        //st.setInt(1,d.getEmployee_id());
       // st.setInt(7,d.getJob_id());
        //st.setInt(9,d.getManger_id());
        //st.setInt(10,d.getDepartment_id());
       // st.setDouble(8,d.getSalary());
        //st.setString(2,d.getFirst_name());
        //st.setString(3,d.getLast_name());
        //st.setString(4,d.getEmail());
        //st.setString(5,d.getPhone_number());
        //st.setString(6,d.getHire_date());
        //st.executeUpdate();
    //}

    //public void deletEmp(int empId) throws SQLException, ClassNotFoundException {
        //Class.forName("org.sqlite.JDBC");
        //Connection conn = DriverManager.getConnection(URL);
        //PreparedStatement st = conn.prepareStatement(DELETE_EMP);
       // st.setInt(1, empId);
        // 1 تعني ايش
        //موقع ال id  في القاعده 1
        //لو كان attribiut ثاني كنت حطيت موقع ثاني
        //st.executeUpdate();
    //}

   // public dbhwemployy selectEmp(int deptId) throws SQLException, ClassNotFoundException {
        //Class.forName("org.sqlite.JDBC");
        //Connection conn = DriverManager.getConnection(URL);
       // PreparedStatement st = conn.prepareStatement(SELECT_ONE_EMP);
        //st.setInt(1, deptId);
        //1 تعني ايش
       // ResultSet rs = st.executeQuery();
        //هاذي تسمح لي انتقل على كل نتيجة تنفيذ rs
        //if(rs.next()) {
          //  return new dbhwemployy(rs);
            //??????/??????/???????/????????????????/?
       // }
       // else {
         //   return null;
       // }
   // }

    //public ArrayList<dbhwemployy> selectAllEmp() throws SQLException, ClassNotFoundException {
     //   Class.forName("org.sqlite.JDBC");
      //  Connection conn = DriverManager.getConnection(URL);
       // PreparedStatement st = conn.prepareStatement(SELECT_ALL_EMP);
       // ResultSet rs = st.executeQuery();
       // ArrayList<dbhwemployy> depts = new ArrayList<>();
       // while (rs.next()) {
          //  depts.add(new dbhwemployy (rs));

            //???//?/???????????
       // }

      //  return depts;
   // }


}

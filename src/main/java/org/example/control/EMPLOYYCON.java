//package org.example.control;


// @Path("/EMPLOYEES")
//احط فيه شكل المسار اللي ابيه يتنفذ
//شكل فقط ولا يوثر
//لكن راح يحطه الشخص نفسه
//public class EMPLOYYCON {

      //dbDAOEMPLOYEeS d = new dbDAOEMPLOYEeS();

      //@GET
      //  اسوي ميثود عادي عشان من خلالها ارجع قيم EMPLOYEES
      // كل قيمه ارجعها عشان كذا ARRAYELIST
      // بدون متغير ليش؟
      //سويت  object من الكلاس هذا لانه من خلاله اوصل للقاعدة والاوامر
      // من نوع ليست لانه يرجع لي قائمة باجميع الموجود في الجدول
      //public ArrayList<dbhwemployy> getALLEmploee() {
          //try {
              //return d.selectAllEmp();
          //} catch (Exception e) {
             // throw new RuntimeException(e);
         // }
      //}


      //@GET
// لمتغير واحد
      //@Path("{embID}")
      // تاخذ متغير
// يرجع لي شيء عشان كذا نوعه
      //public dbhwemployy getoneEmp(@PathParam("embID") int empId) {

          //try {
            //  return d.selectEmp(empId);
          //} catch (Exception e) {
             // throw new RuntimeException(e);
         // }

     // }


      //@DELETE
      // احتاج متغير بناء عليه احذف
      //@Path("{embID}")
     // public void deletEMP(@PathParam("embID") int empId) {
          //try {
             // d.deletEmp(empId);
             // ;
          //} catch (Exception e) {
           //   throw new RuntimeException(e);
         // }

     // }


    //  @POST
      // للاضافه ما احتاج متغير لاني بعدل
      // void  لان خلال الاضافه ما احتاج يرجع شي في الاضافه
    //  public void insrtEmp(dbhwemployy emp) {

         // try {
          //    d.insertEMP(emp);
         // } catch (SQLException e) {
            //  throw new RuntimeException(e);
         // } catch (ClassNotFoundException e) {
          //    throw new RuntimeException(e);
       //   }

     // }


     // @PUT
      //@Path("{empId}")
     // public void Update(@PathParam("embID") int empId,dbhwemployy de) {

          //try {
            //  de.setEmployee_id(empId);
             // d.updateEmp(de);
          //} catch (Exception e) {
            //  throw new RuntimeException(e);
          //}
     // }
 // }

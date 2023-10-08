
package Controller;

import Entity.doctor;
import database.DoctorDao;
import java.util.List;

public class Doctorcontroller {
 private doctor hospitaldoctor=new doctor();
 private DoctorDao dao=new DoctorDao();

    public doctor getHospitaldoctor() {
        return hospitaldoctor;
    }
    public void savedoctor(){dao.savedoctor(hospitaldoctor);}
   
    public List<doctor>getAlldoctor() {   return  dao.getAllDoctor();}
}

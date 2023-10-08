
package database;
import Entity.doctor;
import def.HibernateUtil;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.hibernate.Session;

public class DoctorDao {
   public  void savedoctor(doctor h)
    {try{
        Session ss=HibernateUtil.getSessionFactory().openSession();
        ss.save(h);
        ss.beginTransaction().commit();
       FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Doctor Saved"));
    }catch(Exception e)
    {
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Doctor Already Exist"));
    }
    }
    public  void updatedoctor(doctor h)
    {try{
        Session ss=HibernateUtil.getSessionFactory().openSession();
        ss.update(h);
        ss.beginTransaction().commit();
       FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Doctor updated"));
    }catch(Exception e)
    {
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Doctor doen't Exist"));
    }
    }
    public List<doctor> getAllDoctor()
    {
        Session ss=HibernateUtil.getSessionFactory().openSession();
        List<doctor>list=ss.createQuery("from doctor").list();
        return list;
       
    } 
}

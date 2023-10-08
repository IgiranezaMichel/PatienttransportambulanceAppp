
package database;

import Entity.Hospital;
import def.HibernateUtil;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.hibernate.Session;

public class Hospitaldao {
    public  void saveHospital(Hospital h)
    {try{
        Session ss=HibernateUtil.getSessionFactory().openSession();
        ss.save(h);
        ss.beginTransaction().commit();
       FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Hospital Saved"));
    }catch(Exception e)
    {
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Hospital Already Exist"));
    }
    }
    public  void updateHospital(Hospital h)
    {try{
        Session ss=HibernateUtil.getSessionFactory().openSession();
        ss.update(h);
        ss.beginTransaction().commit();
       FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Hospital updated"));
    }catch(Exception e)
    {
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Hospital doen't Exist"));
    }
    }
    public List<Hospital> getAllHospital()
    {
        Session ss=HibernateUtil.getSessionFactory().openSession();
        List<Hospital>list=ss.createQuery("from Hospital").list();
        return list;
       
    }
}

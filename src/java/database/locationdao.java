
package database;

import Entity.Hospital;
import Entity.locations;
import Entity.patience;
import def.HibernateUtil;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.hibernate.Session;
@ManagedBean
public class locationdao {
    private locations location=new locations();

    public locations getLocation() {
        return location;
    }
    
   public  void savelocations()
    {try{
        Session ss=HibernateUtil.getSessionFactory().openSession();
        ss.save(location);
        ss.beginTransaction().commit();
       FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Location Saved"));
    }catch(Exception e)
    {
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("location Already Exist"));
    }
    }
   public List<locations> getAllLocations()
    {
        Session ss=HibernateUtil.getSessionFactory().openSession();
        List<locations>list=ss.createQuery("from locations").list();
        return list;
       
    }
}

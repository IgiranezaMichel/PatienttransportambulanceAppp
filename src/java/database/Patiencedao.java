
package database;

import Entity.doctor;
import Entity.patience;
import def.HibernateUtil;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.hibernate.Query;
import org.hibernate.Session;


public class Patiencedao {
   public  void savepatience(patience h)
    {try{
        Session ss=HibernateUtil.getSessionFactory().openSession();
        ss.save(h);
        ss.beginTransaction().commit();
       FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Credential Saved"));
    }catch(Exception e)
    {
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Credential Already Exist"));
    }
    }
    public  void updatepatience(patience h)
    {try{
        Session ss=HibernateUtil.getSessionFactory().openSession();
        ss.update(h);
        ss.beginTransaction().commit();
       FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Credential updated"));
    }catch(Exception e)
    {
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Credential doen't Exist"));
    }
    }
    public List<patience> getAllpatience()
    {
        Session ss=HibernateUtil.getSessionFactory().openSession();
        List<patience>list=ss.createQuery("from patience").list();
        return list;
       
    }  
    public List<patience> login(String username,String passwd)
    {
       Session ss=HibernateUtil.getSessionFactory().openSession();
        Query qr=ss.createQuery("from patience where username=:u and passwd=:p");
        qr.setParameter("u", username);
        qr.setParameter("p", passwd);
        List<patience> list=qr.list();
        return list;  
    }
}

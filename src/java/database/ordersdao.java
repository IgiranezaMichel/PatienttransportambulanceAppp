package database;

import Entity.locations;
import Entity.orders;
import def.HibernateUtil;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.hibernate.Session;
public class ordersdao {
    public void saveorder(orders order){try{
        Session ss=HibernateUtil.getSessionFactory().openSession();
        ss.save(order);
        ss.beginTransaction().commit();
       FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("order Saved"));
    }catch(Exception e)
    {
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("orders Already Exist"));
    }
    }
   public List<orders> getAllorders()
    {
        Session ss=HibernateUtil.getSessionFactory().openSession();
        List<orders>list=ss.createQuery("from orders").list();
        return list;
       
    }
}

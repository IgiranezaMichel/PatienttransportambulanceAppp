
package Controller;

import Entity.locations;
import Entity.orders;
import Entity.patience;
import database.Patiencedao;
import database.ordersdao;
import java.util.Date;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
@ManagedBean(name = "PController")
@ApplicationScoped
public class patiencecontroller {
 private patience patient=new patience();
 private Patiencedao dao=new Patiencedao();
  private orders ordders=new orders();
  private locations location=new locations();

    public locations getLocation() {
        return location;
    }
  
    public orders getOrdders() {
        return ordders;
    }
  private ordersdao orderdao=new ordersdao();
    public patience getPatience() { return patient; }
    public void savepatience(){dao.savepatience(patient);}
    
    public List<patience> getAllPatiences(){return  dao.getAllpatience();}
    public String login()
    { List<patience>log= dao.login(patient.getUsername(), patient.getPasswd());
    
    if(log.isEmpty())
    {
        FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("Credential not match"));
        return "index";
    }
    else{
        patient=log.get(0);
        return "Pacienceboard";
    }
    }
//    Save oders
    public void saveorder()
    {   orders o=new orders();
//    patience pat=new patience();
//    pat.setTel(patient.getTel());
System.out.println("-----------------------------------------"+patient.getTel());
    o.setCell(ordders.getCell());
    o.setDateoforder(new Date());
    o.setIsorder(true);
    o.setPatiences(patient);
    o.setSector(ordders.getSector());
    o.setDistrictid(location);
    o.setStreet(ordders.getStreet());
        orderdao.saveorder(o);
    }
    public List<orders>getAllOrders()
    {
        return orderdao.getAllorders();
    }
}

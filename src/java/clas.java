
import Entity.locations;
import Entity.orders;
import Entity.patience;
import database.locationdao;
import database.ordersdao;
import def.HibernateUtil;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eng Michael
 */
public class clas {
    public static void main(String[] args) {
        ordersdao dao=new ordersdao();
        patience pat=new patience();
        pat.setTel("454545");
        orders o=new orders();
   o.setCell("hyt");
    o.setDateoforder(new Date());
    o.setIsorder(true);
    o.setPatiences(pat);
    o.setSector("trrt");
    o.setStreet("rthrt");
        dao.saveorder(o);
}
}

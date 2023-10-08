/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class locations implements Serializable {

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String District) {
        this.District = District;
    }
    @Id
   private String Id;
   private String District;

   @OneToMany(mappedBy = "patiences")
   private List<Hospital> hospital;
   @OneToMany(mappedBy = "districtid")
   private List<orders> orders;

    public List<Hospital> getHospital() {
        return hospital;
    }

    public void setHospital(List<Hospital> hospital) {
        this.hospital = hospital;
    }

    public List<orders> getOrders() {
        return orders;
    }

    public void setOrders(List<orders> orders) {
        this.orders = orders;
    }
}

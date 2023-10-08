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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity  
public class Hospital implements Serializable {
    @Id
    private String Id;
    private String name;
    private String Name;
    @ManyToOne
    private doctor hospital;

    @ManyToOne()
    private locations patiences;
    public doctor getHospital() {
        return hospital;
    }

    public void setHospital(doctor hospital) {
        this.hospital = hospital;
    }
    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

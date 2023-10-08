/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import Entity.Hospital;
import Entity.patience;
import java.io.Serializable;
import java.util.Date;import java.util.List;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;import javax.persistence.OneToOne;
@Entity
public class orders implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private boolean  isorder;

    private Date dateoforder;
    @ManyToOne
    private patience patiences;
    private String Sector;
    private String cell;
    private String Street;
    @ManyToOne
    private locations districtid;

    public locations getDistrictid() {
        return districtid;
    }

    public void setDistrictid(locations districtid) {
        this.districtid = districtid;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isIsorder() {
        return isorder;
    }

    public void setIsorder(boolean isorder) {
        this.isorder = isorder;
    }
 
    public Date getDateoforder() {
        return dateoforder;
    }

    public void setDateoforder(Date dateoforder) {
        this.dateoforder = dateoforder;
    }

    public patience getPatiences() {
        return patiences;
    }

    public void setPatiences(patience patiences) {
        this.patiences = patiences;
    }

    public String getSector() {
        return Sector;
    }

    public void setSector(String Sector) {
        this.Sector = Sector;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }
     
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agency;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Destiny Gumede
 */
@Entity
@Table(name = "handymen", catalog = "rental_agency", schema = "")
@NamedQueries({
    @NamedQuery(name = "Handymen.findAll", query = "SELECT h FROM Handymen h")
    , @NamedQuery(name = "Handymen.findById", query = "SELECT h FROM Handymen h WHERE h.id = :id")
    , @NamedQuery(name = "Handymen.findByName", query = "SELECT h FROM Handymen h WHERE h.name = :name")
    , @NamedQuery(name = "Handymen.findBySurname", query = "SELECT h FROM Handymen h WHERE h.surname = :surname")
    , @NamedQuery(name = "Handymen.findByContactNum", query = "SELECT h FROM Handymen h WHERE h.contactNum = :contactNum")
    , @NamedQuery(name = "Handymen.findByProfession", query = "SELECT h FROM Handymen h WHERE h.profession = :profession")})
public class Handymen implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "surname")
    private String surname;
    @Basic(optional = false)
    @Column(name = "contact_num")
    private String contactNum;
    @Basic(optional = false)
    @Column(name = "profession")
    private String profession;

    public Handymen() {
    }

    public Handymen(Integer id) {
        this.id = id;
    }

    public Handymen(Integer id, String name, String surname, String contactNum, String profession) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.contactNum = contactNum;
        this.profession = profession;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        String oldSurname = this.surname;
        this.surname = surname;
        changeSupport.firePropertyChange("surname", oldSurname, surname);
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        String oldContactNum = this.contactNum;
        this.contactNum = contactNum;
        changeSupport.firePropertyChange("contactNum", oldContactNum, contactNum);
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        String oldProfession = this.profession;
        this.profession = profession;
        changeSupport.firePropertyChange("profession", oldProfession, profession);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Handymen)) {
            return false;
        }
        Handymen other = (Handymen) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Agency.Handymen[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

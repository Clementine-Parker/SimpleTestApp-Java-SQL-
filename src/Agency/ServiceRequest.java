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
@Table(name = "service_request", catalog = "rental_agency", schema = "")
@NamedQueries({
    @NamedQuery(name = "ServiceRequest.findAll", query = "SELECT s FROM ServiceRequest s")
    , @NamedQuery(name = "ServiceRequest.findById", query = "SELECT s FROM ServiceRequest s WHERE s.id = :id")
    , @NamedQuery(name = "ServiceRequest.findByName", query = "SELECT s FROM ServiceRequest s WHERE s.name = :name")
    , @NamedQuery(name = "ServiceRequest.findBySurname", query = "SELECT s FROM ServiceRequest s WHERE s.surname = :surname")
    , @NamedQuery(name = "ServiceRequest.findByContactNum", query = "SELECT s FROM ServiceRequest s WHERE s.contactNum = :contactNum")
    , @NamedQuery(name = "ServiceRequest.findByRoomNum", query = "SELECT s FROM ServiceRequest s WHERE s.roomNum = :roomNum")
    , @NamedQuery(name = "ServiceRequest.findByIssue", query = "SELECT s FROM ServiceRequest s WHERE s.issue = :issue")
    , @NamedQuery(name = "ServiceRequest.findByApproval", query = "SELECT s FROM ServiceRequest s WHERE s.approval = :approval")})
public class ServiceRequest implements Serializable {

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
    @Column(name = "room_num")
    private String roomNum;
    @Basic(optional = false)
    @Column(name = "issue")
    private String issue;
    @Basic(optional = false)
    @Column(name = "approval")
    private String approval;

    public ServiceRequest() {
    }

    public ServiceRequest(Integer id) {
        this.id = id;
    }

    public ServiceRequest(Integer id, String name, String surname, String contactNum, String roomNum, String issue, String approval) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.contactNum = contactNum;
        this.roomNum = roomNum;
        this.issue = issue;
        this.approval = approval;
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

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        String oldRoomNum = this.roomNum;
        this.roomNum = roomNum;
        changeSupport.firePropertyChange("roomNum", oldRoomNum, roomNum);
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        String oldIssue = this.issue;
        this.issue = issue;
        changeSupport.firePropertyChange("issue", oldIssue, issue);
    }

    public String getApproval() {
        return approval;
    }

    public void setApproval(String approval) {
        String oldApproval = this.approval;
        this.approval = approval;
        changeSupport.firePropertyChange("approval", oldApproval, approval);
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
        if (!(object instanceof ServiceRequest)) {
            return false;
        }
        ServiceRequest other = (ServiceRequest) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Agency.ServiceRequest[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

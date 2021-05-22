/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProjectPackage;

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
 * @author User
 */
@Entity
@Table(name = "customertbl", catalog = "libsysdb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Customertbl.findAll", query = "SELECT c FROM Customertbl c")
    , @NamedQuery(name = "Customertbl.findByCustomerid", query = "SELECT c FROM Customertbl c WHERE c.customerid = :customerid")
    , @NamedQuery(name = "Customertbl.findByFirstname", query = "SELECT c FROM Customertbl c WHERE c.firstname = :firstname")
    , @NamedQuery(name = "Customertbl.findByLastname", query = "SELECT c FROM Customertbl c WHERE c.lastname = :lastname")
    , @NamedQuery(name = "Customertbl.findByContactnum", query = "SELECT c FROM Customertbl c WHERE c.contactnum = :contactnum")
    , @NamedQuery(name = "Customertbl.findByEmail", query = "SELECT c FROM Customertbl c WHERE c.email = :email")
    , @NamedQuery(name = "Customertbl.findByAddress", query = "SELECT c FROM Customertbl c WHERE c.address = :address")})
public class Customertbl implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "customerid")
    private Integer customerid;
    @Basic(optional = false)
    @Column(name = "firstname")
    private String firstname;
    @Basic(optional = false)
    @Column(name = "lastname")
    private String lastname;
    @Basic(optional = false)
    @Column(name = "contactnum")
    private String contactnum;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "address")
    private String address;

    public Customertbl() {
    }

    public Customertbl(Integer customerid) {
        this.customerid = customerid;
    }

    public Customertbl(Integer customerid, String firstname, String lastname, String contactnum, String email, String address) {
        this.customerid = customerid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.contactnum = contactnum;
        this.email = email;
        this.address = address;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        Integer oldCustomerid = this.customerid;
        this.customerid = customerid;
        changeSupport.firePropertyChange("customerid", oldCustomerid, customerid);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        String oldFirstname = this.firstname;
        this.firstname = firstname;
        changeSupport.firePropertyChange("firstname", oldFirstname, firstname);
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        String oldLastname = this.lastname;
        this.lastname = lastname;
        changeSupport.firePropertyChange("lastname", oldLastname, lastname);
    }

    public String getContactnum() {
        return contactnum;
    }

    public void setContactnum(String contactnum) {
        String oldContactnum = this.contactnum;
        this.contactnum = contactnum;
        changeSupport.firePropertyChange("contactnum", oldContactnum, contactnum);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerid != null ? customerid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customertbl)) {
            return false;
        }
        Customertbl other = (Customertbl) object;
        if ((this.customerid == null && other.customerid != null) || (this.customerid != null && !this.customerid.equals(other.customerid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FinalProjectPackage.Customertbl[ customerid=" + customerid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

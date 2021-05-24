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
@Table(name = "bookstbl", catalog = "libsysdb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Bookstbl.findAll", query = "SELECT b FROM Bookstbl b")
    , @NamedQuery(name = "Bookstbl.findByBookid", query = "SELECT b FROM Bookstbl b WHERE b.bookid = :bookid")
    , @NamedQuery(name = "Bookstbl.findByTitle", query = "SELECT b FROM Bookstbl b WHERE b.title = :title")
    , @NamedQuery(name = "Bookstbl.findByAuthor", query = "SELECT b FROM Bookstbl b WHERE b.author = :author")
    , @NamedQuery(name = "Bookstbl.findByPublisher", query = "SELECT b FROM Bookstbl b WHERE b.publisher = :publisher")
    , @NamedQuery(name = "Bookstbl.findByGenre", query = "SELECT b FROM Bookstbl b WHERE b.genre = :genre")
    , @NamedQuery(name = "Bookstbl.findByLocation", query = "SELECT b FROM Bookstbl b WHERE b.location = :location")})
public class Bookstbl implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "bookid")
    private Integer bookid;
    @Basic(optional = false)
    @Column(name = "title")
    private String title;
    @Basic(optional = false)
    @Column(name = "author")
    private String author;
    @Basic(optional = false)
    @Column(name = "publisher")
    private String publisher;
    @Basic(optional = false)
    @Column(name = "genre")
    private String genre;
    @Basic(optional = false)
    @Column(name = "location")
    private String location;

    public Bookstbl() {
    }

    public Bookstbl(Integer bookid) {
        this.bookid = bookid;
    }

    public Bookstbl(Integer bookid, String title, String author, String publisher, String genre, String location) {
        this.bookid = bookid;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.genre = genre;
        this.location = location;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        Integer oldBookid = this.bookid;
        this.bookid = bookid;
        changeSupport.firePropertyChange("bookid", oldBookid, bookid);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        String oldTitle = this.title;
        this.title = title;
        changeSupport.firePropertyChange("title", oldTitle, title);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        String oldAuthor = this.author;
        this.author = author;
        changeSupport.firePropertyChange("author", oldAuthor, author);
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        String oldPublisher = this.publisher;
        this.publisher = publisher;
        changeSupport.firePropertyChange("publisher", oldPublisher, publisher);
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        String oldGenre = this.genre;
        this.genre = genre;
        changeSupport.firePropertyChange("genre", oldGenre, genre);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        String oldLocation = this.location;
        this.location = location;
        changeSupport.firePropertyChange("location", oldLocation, location);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookid != null ? bookid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bookstbl)) {
            return false;
        }
        Bookstbl other = (Bookstbl) object;
        if ((this.bookid == null && other.bookid != null) || (this.bookid != null && !this.bookid.equals(other.bookid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FinalProjectPackage.Bookstbl[ bookid=" + bookid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

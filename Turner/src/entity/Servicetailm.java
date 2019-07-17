/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ANDRES
 */
@Entity
@Table(name = "servicetailm")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Servicetailm.findAll", query = "SELECT s FROM Servicetailm s")
    , @NamedQuery(name = "Servicetailm.findByServicefk", query = "SELECT s FROM Servicetailm s WHERE s.servicefk = :servicefk")
    , @NamedQuery(name = "Servicetailm.findByTurn", query = "SELECT s FROM Servicetailm s WHERE s.turn = :turn")
    , @NamedQuery(name = "Servicetailm.findByServicename", query = "SELECT s FROM Servicetailm s WHERE s.servicename = :servicename")
    , @NamedQuery(name = "Servicetailm.findByFact", query = "SELECT s FROM Servicetailm s WHERE s.fact = :fact")
    , @NamedQuery(name = "Servicetailm.findByUserid", query = "SELECT s FROM Servicetailm s WHERE s.userid = :userid")
    , @NamedQuery(name = "Servicetailm.findByUsername", query = "SELECT s FROM Servicetailm s WHERE s.username = :username")
    , @NamedQuery(name = "Servicetailm.findByPriority", query = "SELECT s FROM Servicetailm s WHERE s.priority = :priority")
    , @NamedQuery(name = "Servicetailm.findByPriorityname", query = "SELECT s FROM Servicetailm s WHERE s.priorityname = :priorityname")})
public class Servicetailm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "servicefk")
    private String servicefk;
    @Basic(optional = false)
    @Column(name = "turn")
    private int turn;
    @Column(name = "servicename")
    private String servicename;
    @Column(name = "fact")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fact;
    @Column(name = "userid")
    private String userid;
    @Column(name = "username")
    private String username;
    @Column(name = "priority")
    private Boolean priority;
    @Column(name = "priorityname")
    private String priorityname;

    public Servicetailm() {
    }

    public Servicetailm(String servicefk) {
        this.servicefk = servicefk;
    }

    public Servicetailm(String servicefk, int turn) {
        this.servicefk = servicefk;
        this.turn = turn;
    }

    public String getServicefk() {
        return servicefk;
    }

    public void setServicefk(String servicefk) {
        this.servicefk = servicefk;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename;
    }

    public Date getFact() {
        return fact;
    }

    public void setFact(Date fact) {
        this.fact = fact;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getPriority() {
        return priority;
    }

    public void setPriority(Boolean priority) {
        this.priority = priority;
    }

    public String getPriorityname() {
        return priorityname;
    }

    public void setPriorityname(String priorityname) {
        this.priorityname = priorityname;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (servicefk != null ? servicefk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Servicetailm)) {
            return false;
        }
        Servicetailm other = (Servicetailm) object;
        if ((this.servicefk == null && other.servicefk != null) || (this.servicefk != null && !this.servicefk.equals(other.servicefk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Servicetailm[ servicefk=" + servicefk + " ]";
    }
    
}

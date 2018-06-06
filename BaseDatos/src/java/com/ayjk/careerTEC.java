/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ayjk;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Jonathan
 */
@Entity
public class careerTEC implements Serializable {

    @OneToMany(mappedBy = "career")
    private List<studentInfo> studentInfos;

        private String careerName;

    /**
     * Get the value of careerName
     *
     * @return the value of careerName
     */
    public String getCareerName() {
        return careerName;
    }

    /**
     * Set the value of careerName
     *
     * @param careerName new value of careerName
     */
    public void setCareerName(String careerName) {
        this.careerName = careerName;
    }
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof careerTEC)) {
            return false;
        }
        careerTEC other = (careerTEC) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ayjk.careerTEC[ id=" + id + " ]";
    }    

    public List<studentInfo> getStudentInfos() {
        return studentInfos;
    }

    public void setStudentInfos(List<studentInfo> studentInfos) {
        this.studentInfos = studentInfos;
    }
    
    
}

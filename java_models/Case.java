package org.ateam.common.lawmodel;

import javax.persistence.Entity;
import javax.persistence.*;

/**
 * Created by OPSKMC on 8/22/15.
 */
    @Entity
    @Table(name="iiit_case")
    public class Case {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;
        @Basic
        private String description;
        @ManyToOne(cascade = CascadeType.ALL)
        private Lawyer lawyer;
        @ManyToOne(cascade = CascadeType.ALL)
        private Department department;
//        @OneToMany
//        private Collection<Hearing> hearings;
        private String lastStatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Lawyer getLawyer() {
        return lawyer;
    }

    public void setLawyer(Lawyer lawyer) {
        this.lawyer = lawyer;
    }

    public String getLastStatus() {
        return lastStatus;
    }

    public void setLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
    }
}

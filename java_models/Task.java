package org.ateam.common.lawmodel;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by OPSKMC on 8/22/15.
 */
@Entity
@Table(name = "iiitd_task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    //csv
    private String requirements;
    @ManyToOne(cascade = CascadeType.ALL)
    private Lawyer lawyer;
    @ManyToOne(cascade = CascadeType.ALL)
    private Department department;
    private Date deadline;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public Lawyer getLawyer() {
        return lawyer;
    }

    public void setLawyer(Lawyer lawyer) {
        this.lawyer = lawyer;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
}

package org.ateam.common.lawmodel;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by OPSKMC on 8/22/15.
 */
@Entity
@Table(name="iiit_department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Basic
    private String name;
    @OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
    private Collection<Case> cases;
    @OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
    private Collection<Task> tasks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Case> getCases() {
        return cases;
    }

    public void setCases(Collection<Case> cases) {
        this.cases = cases;
    }

    public Collection<Task> getTasks() {
        return tasks;
    }

    public void setTasks(Collection<Task> tasks) {
        this.tasks = tasks;
    }
}

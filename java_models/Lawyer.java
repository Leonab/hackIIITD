package org.ateam.common.lawmodel;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by OPSKMC on 8/22/15.
 */
@Entity
@Table(name = "iiitd_lawyer")
public class Lawyer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @OneToMany(mappedBy = "lawyer",cascade = CascadeType.ALL)
    private Collection<Case> cases;
    @OneToMany(mappedBy = "lawyer",cascade = CascadeType.ALL)
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
}

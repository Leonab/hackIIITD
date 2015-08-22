package piedpiper.org.sceptre.api.model;


import java.util.Collection;

/**
 * Created by OPSKMC on 8/22/15.
 */
public class Department {
    private int id;
    private String name;
    private Collection<Case> cases;
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

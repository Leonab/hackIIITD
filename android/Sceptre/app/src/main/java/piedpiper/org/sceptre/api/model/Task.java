package piedpiper.org.sceptre.api.model;


import java.util.Date;

/**
 * Created by OPSKMC on 8/22/15.
 */
public class Task {
    private int id;
    private String requirements;
    private Lawyer lawyer;
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

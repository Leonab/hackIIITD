package piedpiper.org.sceptre.api.model;


/**
 * Created by OPSKMC on 8/22/15.
 */
    public class Case {
        private int id;
        private String description;
        private Lawyer lawyer;
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

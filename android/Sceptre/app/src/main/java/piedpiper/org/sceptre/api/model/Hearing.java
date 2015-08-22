package piedpiper.org.sceptre.api.model;

import java.util.Date;

/**
 * Created by OPSKMC on 8/22/15.
 */
public class Hearing {
    private int id;
    private Case associatedCase;

    private String status;
    private String notes;
    private Date date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Case getAssociatedCase() {
        return associatedCase;
    }

    public void setAssociatedCase(Case associatedCase) {
        this.associatedCase = associatedCase;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

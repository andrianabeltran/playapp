package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Task extends Model {

    @Id
    public String id;

    @play.data.validation.Constraints.Required
    public String contents;

    @play.data.validation.Constraints.Required
    public String assignee;

    @play.data.validation.Constraints.Required
    public String date;
}


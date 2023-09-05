package app.Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class GymPackages {
    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name = "Gymid")
    private Gym gym;

    private String packageName;

    private float price;

    private int spaSessions;

    private int invitations;

    private int freezeDays;

    private int coachingSessions;

    private String notes;
}

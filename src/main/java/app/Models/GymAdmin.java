package app.Models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class GymAdmin extends User{
    
    @OneToOne
    @JoinColumn(name = "Admin_id")
    private Gym gym;

}

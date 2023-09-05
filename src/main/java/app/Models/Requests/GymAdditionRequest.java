package app.Models.Requests;

import javax.persistence.Entity;

import app.Models.Gym;

@Entity
public class GymAdditionRequest extends Request{

    private Gym tempGym;

    private boolean reviewed;

    private boolean accepted;

}

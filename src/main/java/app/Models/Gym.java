package app.Models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import app.Util.Location;

@Entity
public class Gym{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String gymName;

    @Enumerated(EnumType.STRING)
    private Set<Location> locations; // make a table locations and fix this

    private String description;

    @OneToOne(mappedBy = "gym", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private GymAdmin admin;

    @OneToMany(mappedBy = "gym", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<GymPackages> packages;
}

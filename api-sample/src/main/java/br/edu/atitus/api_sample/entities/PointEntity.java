package br.edu.atitus.api_sample.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_point")
public class PointEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(columnDefinition = "Decimal(17,14)", nullable = false)
    private double latitude;

    @Column(columnDefinition = "Decimal(17,14)", nullable = false)
    private double longitude;

    @Column(length = 250, nullable = false)
    private String description;

    @ManyToOne
    private UserEntity user;

    // GETTERS

    public UUID getId() {
        return id;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getDescription() {
        return description;
    }

    public UserEntity getUser() {
        return user;
    }

    // SETTERS

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUser(UserEntity userAuth) {
        this.user = userAuth;
    }
}

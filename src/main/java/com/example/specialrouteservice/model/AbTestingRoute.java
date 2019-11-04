package com.example.specialrouteservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "routes")
public class AbTestingRoute {

    @Id
    @Column(name = "route_id")
    String route_id;
    @Column(name = "servicename")
    String serviceName;
    @Column(name = "active")
    String active;
    @Column(name = "endpoint")
    String endpoint;
    @Column(name = "weight")
    Integer weight;
}
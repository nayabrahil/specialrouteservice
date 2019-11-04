package com.example.specialrouteservice.repository;

import com.example.specialrouteservice.model.AbTestingRoute;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface RouteRepository extends Repository<AbTestingRoute, String> {

    List<AbTestingRoute> findAbTestingRouteByServiceName(String serviceName);
}

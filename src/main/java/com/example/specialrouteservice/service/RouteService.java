package com.example.specialrouteservice.service;

import com.example.specialrouteservice.model.AbTestingRoute;
import com.example.specialrouteservice.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RouteService {

    @Autowired
    private RouteRepository routeRepository;

    public AbTestingRoute getRouteForService(String serviceName){
        return routeRepository.findAbTestingRouteByServiceName(serviceName).get(0);
    }
}

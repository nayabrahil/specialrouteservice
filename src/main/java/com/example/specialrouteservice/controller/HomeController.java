package com.example.specialrouteservice.controller;

import com.example.specialrouteservice.model.AbTestingRoute;
import com.example.specialrouteservice.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    RouteService routeService;

    @GetMapping("v1/route/abtesting/{serviceName}")
    public ResponseEntity<AbTestingRoute> getAbTestingRoute(@PathVariable("serviceName") String serviceName){
        return ResponseEntity.ok(routeService.getRouteForService(serviceName));
    }
}

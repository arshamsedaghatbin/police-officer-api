package com.police.officer.client;

import com.police.officer.dto.PoliceOfficerDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;

@FeignClient(url = "localhost:8080")
public interface PoliceOfficerClient {
    @PostMapping("/api/police-officers")
    ResponseEntity<PoliceOfficerDTO> createPoliceOfficer(@RequestBody PoliceOfficerDTO policeOfficerDTO) throws URISyntaxException ;
    @PutMapping("/api/police-officers")
    ResponseEntity<PoliceOfficerDTO> updatePoliceOfficer(@RequestBody PoliceOfficerDTO policeOfficerDTO) throws URISyntaxException ;
    @GetMapping("/api/police-officers")
    ResponseEntity<List<PoliceOfficerDTO>> getAllPoliceOfficers(Pageable pageable) ;
    @GetMapping("/api/police-officers/{id}")
    ResponseEntity<PoliceOfficerDTO> getPoliceOfficer(@PathVariable Long id) ;
    @DeleteMapping("/api/police-officers/{id}")
    ResponseEntity<Void> deletePoliceOfficer(@PathVariable Long id) ;
}

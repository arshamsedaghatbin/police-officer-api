package com.police.officer.client;

import com.police.officer.dto.PoliceDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;

@FeignClient(url = "localhost:8080")
public interface PoliceClient {
    @PostMapping("/api/police")
     ResponseEntity<PoliceDTO> createPolice(@RequestBody PoliceDTO policeDTO) throws URISyntaxException ;
    @PutMapping("/api/police")
     ResponseEntity<PoliceDTO> updatePolice(@RequestBody PoliceDTO policeDTO) throws URISyntaxException ;
    @GetMapping("/api/police")
     ResponseEntity<List<PoliceDTO>> getAllPolice(Pageable pageable) ;
    @GetMapping("/api/police/{id}")
     ResponseEntity<PoliceDTO> getPolice(@PathVariable Long id) ;
    @DeleteMapping("/api/police/{id}")
     ResponseEntity<Void> deletePolice(@PathVariable Long id) ;
}

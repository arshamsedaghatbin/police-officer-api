package com.police.officer.client;

import com.police.officer.dto.StolenBikerDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;

@FeignClient(url = "localhost:8080",name="employee-producer")
 public interface StolenBikerClient {


    @PostMapping("/api/stolen-bikers")
     ResponseEntity<StolenBikerDTO> createStolenBiker(@RequestBody StolenBikerDTO stolenBikerDTO) throws URISyntaxException ;
    @PutMapping("/api/stolen-bikers")
     ResponseEntity<StolenBikerDTO> updateStolenBiker(@RequestBody StolenBikerDTO stolenBikerDTO) throws URISyntaxException ;
    @GetMapping("/api/stolen-bikers")
     ResponseEntity<List<StolenBikerDTO>> getAllStolenBikers(Pageable pageable) ;
    @PostMapping("/api/search/stolen-bikers")
     ResponseEntity<List<StolenBikerDTO>> searchStolenBiker(@RequestBody StolenBikerDTO stolenBikerDTO) ;
    @GetMapping("/api/stolen-bikers/{id}")
     ResponseEntity<StolenBikerDTO> getStolenBiker(@PathVariable Long id) ;
    @DeleteMapping("/api/stolen-bikers/{id}")
     ResponseEntity<Void> deleteStolenBiker(@PathVariable Long id) ;
}

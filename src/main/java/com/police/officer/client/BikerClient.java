package com.police.officer.client;

import com.police.officer.dto.BikerDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;

@FeignClient(url = "localhost:8080")
public interface BikerClient {
    @PostMapping("/api/bikers")
    public ResponseEntity<BikerDTO> createBiker(@RequestBody BikerDTO bikerDTO) throws URISyntaxException ;
    @PutMapping("/api/bikers")
    public ResponseEntity<BikerDTO> updateBiker(@RequestBody BikerDTO bikerDTO) throws URISyntaxException ;
    @GetMapping("/api/bikers")
    public List<BikerDTO> getAllBikers() ;
    @GetMapping("/api/bikers/{id}")
    public ResponseEntity<BikerDTO> getBiker(@PathVariable Long id) ;
    @DeleteMapping("/api/bikers/{id}")
    public ResponseEntity<Void> deleteBiker(@PathVariable Long id) ;
}

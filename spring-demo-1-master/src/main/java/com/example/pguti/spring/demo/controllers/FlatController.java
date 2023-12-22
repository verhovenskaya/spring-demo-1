package com.example.pguti.spring.demo.controllers;

import com.example.pguti.spring.demo.entity.Flat;
import com.example.pguti.spring.demo.services.FlatService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/flats")
public class FlatController {
    @Autowired
    private FlatService flatService;

    @PostMapping()
    public void save(@RequestBody Flat flat) {
        log.info("Create new flat: {}", flat);
        flatService.save(flat);
    }

    @GetMapping()
    public List<Flat> getAllFlats() {
        return flatService.getAll();
    }

    @GetMapping("/retry2")
    public String testRetry2(@RequestParam("retry") boolean retry) {
        return flatService.testRetry2(retry);
    }

    @GetMapping("/retry")
    public String testRetry(@RequestParam("retry") boolean retry) {
        return flatService.testRetry(retry);
    }

    @GetMapping("/{id}")
    public Flat getFlat(@PathVariable("id") Long id) {
        return flatService.getFlat(id);
    }

    @PutMapping("/{id}")
    public Flat updateFlat(@PathVariable("id") Long id, @RequestBody Flat flat) {
        return flatService.updateFlat(id, flat);
    }

    @DeleteMapping("/{id}")
    public void deleteFlat(@PathVariable("id") Long id) {
        flatService.deleteFlat(id);
    }
}
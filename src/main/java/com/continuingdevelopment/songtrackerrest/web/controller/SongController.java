package com.continuingdevelopment.songtrackerrest.web.controller;

import com.continuingdevelopment.songtrackerrest.web.model.SongRequestObject;
import com.continuingdevelopment.songtrackerrest.web.model.SongResponseObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/song")
@RestController
public class SongController {

    @PostMapping
    public ResponseEntity<SongResponseObject> createSong(@RequestBody SongRequestObject songRequestObject){
        //TODO impl
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping({"/{songId}"})
    public ResponseEntity<SongResponseObject> getSongById(@PathVariable("songId") UUID songId){
        //TODO impl
        return new ResponseEntity<>(SongResponseObject.builder().build(), HttpStatus.OK);
    }

    @PutMapping({"/{songId}"})
    public ResponseEntity<SongResponseObject> updateSong(@PathVariable("songId") UUID songId, @RequestBody SongRequestObject songRequestObject){
        //TODO impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{songId}"})
    public ResponseEntity<SongResponseObject> deleteSongById(@PathVariable("songId") UUID songId){
        //TODO impl
        return new ResponseEntity(SongResponseObject.builder().build(), HttpStatus.NO_CONTENT);
    }
}

package com.continuingdevelopment.songtrackerrest.web.controller;

import com.continuingdevelopment.songtrackerrest.web.model.SongRequestObject;
import com.continuingdevelopment.songtrackerrest.web.model.SongResponseObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
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

    private static final Logger LOG = LoggerFactory.getLogger(SongController.class);

    @PostMapping
    public ResponseEntity<SongResponseObject> createSong(@Validated @RequestBody SongRequestObject songRequestObject){
        //TODO impl
        LOG.info("*** Resource /api/v1/song/ made call to createSong with request body " + songRequestObject + " ***");
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping({"/{songId}"})
    public ResponseEntity<SongResponseObject> getSongById(@PathVariable("songId") UUID songId){
        //TODO impl
        LOG.info("*** Resource /api/v1/song/" + songId + " made call to getSongById ***");
        return new ResponseEntity<>(SongResponseObject.builder().build(), HttpStatus.OK);
    }

    @PutMapping({"/{songId}"})
    public ResponseEntity<SongResponseObject> updateSong(@PathVariable("songId") UUID songId, @Validated @RequestBody SongRequestObject songRequestObject){
        //TODO impl
        LOG.info("*** Resource /api/v1/song/" + songId + " made call to updateSong with request body " + songRequestObject + " ***");
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{songId}"})
    public ResponseEntity<SongResponseObject> deleteSongById(@PathVariable("songId") UUID songId){
        //TODO impl
        LOG.debug("*** Resource /api/v1/song/" + songId + " made call to deleteSongById ***");
        return new ResponseEntity(SongResponseObject.builder().build(), HttpStatus.NO_CONTENT);
    }
}

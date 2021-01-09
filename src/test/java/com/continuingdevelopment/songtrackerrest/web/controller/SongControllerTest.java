package com.continuingdevelopment.songtrackerrest.web.controller;

import com.continuingdevelopment.songtrackerrest.web.model.SongRequestObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class SongControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void createSong() throws Exception {
        SongRequestObject songRequestObject = SongRequestObject.builder().build();
        String songRequestJson = objectMapper.writeValueAsString(songRequestObject);
        mockMvc.perform(post("/api/v1/song")
                .contentType(MediaType.APPLICATION_JSON)
                .content(songRequestJson))
                .andExpect(status().isCreated());
    }

    @Test
    void getSongById() throws Exception {
        mockMvc.perform(get("/api/v1/song/" + UUID.randomUUID())
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void updateSong() throws Exception {
        SongRequestObject songRequestObject = SongRequestObject.builder().build();
        String songRequestJson = objectMapper.writeValueAsString(songRequestObject);
        mockMvc.perform(put("/api/v1/song/" + UUID.randomUUID())
                .contentType(MediaType.APPLICATION_JSON)
                .content(songRequestJson))
                .andExpect(status().isNoContent());
    }

    @Test
    void deleteSongById() throws Exception {
        mockMvc.perform(delete("/api/v1/song/" + UUID.randomUUID())
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isNoContent());
    }
}

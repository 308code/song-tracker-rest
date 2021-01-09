package com.continuingdevelopment.songtrackerrest.bootstrap;


import com.continuingdevelopment.songtrackerrest.domain.Song;
import com.continuingdevelopment.songtrackerrest.repositories.SongRepository;
import com.continuingdevelopment.songtrackerrest.web.model.MachineEnum;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;

@Component
public class SongLoader implements CommandLineRunner {

    private final SongRepository songRepository;

    public SongLoader(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadSongObjects();
    }

    private void loadSongObjects(){
        if(songRepository.count() == 0){
            songRepository.save(Song.builder()
                    .title("Hello World!")
                    .aka("Hello World!")
                    .machine(MachineEnum.B)
                    .played(OffsetDateTime.now())
                    .tithing(true)
                    .sequence("")
                    .note("This is Hello World Note").build());

            songRepository.save(Song.builder()
                    .title("Hello World!!")
                    .aka("Hello World!!")
                    .machine(MachineEnum.A)
                    .played(OffsetDateTime.now())
                    .tithing(false)
                    .sequence("")
                    .note("This is Hello World Note 2").build());
        }
    }
}

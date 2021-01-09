package com.continuingdevelopment.songtrackerrest.repositories;

import com.continuingdevelopment.songtrackerrest.domain.Song;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface SongRepository extends PagingAndSortingRepository<Song, UUID> {
}

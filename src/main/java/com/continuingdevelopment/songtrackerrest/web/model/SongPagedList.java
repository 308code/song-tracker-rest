package com.continuingdevelopment.songtrackerrest.web.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class SongPagedList extends PageImpl<SongResponseObject> {

    public SongPagedList(List<SongResponseObject> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public SongPagedList(List<SongResponseObject> content) {
        super(content);
    }
}

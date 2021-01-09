package com.continuingdevelopment.songtrackerrest.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SongRequestObject {
    private String title;
    private String aka;
    private MachineEnum machine;
    private OffsetDateTime played;
    private boolean tithing;
    private String[] sequence;
    private String note;
}

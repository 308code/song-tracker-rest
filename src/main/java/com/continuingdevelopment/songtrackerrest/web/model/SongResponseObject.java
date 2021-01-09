package com.continuingdevelopment.songtrackerrest.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SongResponseObject {
    private UUID id;
    private String title;
    private String aka;
    private MachineEnum machine;
    private OffsetDateTime played;
    private boolean tithing;
    private String[] sequence;
    private String note;
}

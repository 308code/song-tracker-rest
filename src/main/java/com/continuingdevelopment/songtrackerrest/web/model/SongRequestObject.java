package com.continuingdevelopment.songtrackerrest.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SongRequestObject {
    @NotBlank
    private String title;
    private String aka;
    @NotNull
    private MachineEnum machine;
    @NotNull
    private OffsetDateTime played;
    private boolean tithing;
    @NotNull
    private String sequence;
    private String note;
}

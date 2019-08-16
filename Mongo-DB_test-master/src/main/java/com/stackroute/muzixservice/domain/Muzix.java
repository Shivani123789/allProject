package com.stackroute.muzixservice.domain;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@Data
@NoArgsConstructor
@Builder
public class Muzix {
    @Id
    int trackId;
    String trackName;
    String trackComment;

//constructor is created
    public Muzix(int trackId, String trackName, String trackComment) {
        this.trackId = trackId;
        this.trackName = trackName;
        this.trackComment = trackComment;
    }
}

package com.koreait.short_url_project_02;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class Surl {
    private Long id;
    private LocalDateTime createDate = LocalDateTime.now();
    private LocalDateTime modifyDate = LocalDateTime.now();
    private String body;
    private String url;
}

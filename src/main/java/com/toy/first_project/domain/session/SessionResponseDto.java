package com.toy.first_project.domain.session;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class SessionResponseDto {

    private final String id;
    private final String name;

}

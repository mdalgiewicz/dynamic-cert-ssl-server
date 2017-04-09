package com.dalgim.example.sb.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by dalgim on 09.04.2017.
 */
@Getter
@Setter
@Builder
public class Book {

    private Long id;
    private String name;
}

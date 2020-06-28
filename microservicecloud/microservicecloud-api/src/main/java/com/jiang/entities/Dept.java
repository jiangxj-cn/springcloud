package com.jiang.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@SuppressWarnings("serial")
@Data
@Accessors(chain=true)
public class Dept implements Serializable {
    public Dept(Long id, String name, String db_source) {
        this.id = id;
        this.name = name;
        this.db_source = db_source;
    }

    private Long id;
    private String name;
    private String db_source;

    public Dept() {
    }
}

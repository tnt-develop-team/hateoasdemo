package com.example;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by owen on 1/21/17.
 */
@Entity
@Data
public class Tool {
    @Id @GeneratedValue
    private Long id;

    private String name;
    private String description;

    public Tool() {

    }
}

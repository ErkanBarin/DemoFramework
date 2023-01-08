package com.DS.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class client {
    private int id;
    private String name;
    private String gender;
    private long  phone;

    public client(int id, String name, String gender, long phone) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
    }
    public client(){

    }
}

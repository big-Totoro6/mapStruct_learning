package org.example;


import lombok.Data;

@Data
public class PeopleDto {
    private String nameDto;
    private int id;
    private double height;

    public PeopleDto(String nameDto, int id, double height) {
        this.nameDto = nameDto;
        this.id = id;
        this.height = height;
    }
}

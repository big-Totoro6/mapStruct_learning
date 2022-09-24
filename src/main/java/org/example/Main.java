package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        People people = new People("Jason", 1, 22,1l,"180.5");
        //转Dto
        PeopleDto peopleDto = PeopleMapper.INSTANCE.peopleToPeopleDto(people);
        System.out.println(peopleDto.toString());
        //Dto转entity
        PeopleDto cindy = new PeopleDto("Cindy", 22, 173.5);
        People source = PeopleMapper.INSTANCE.toSource(cindy);
        System.out.println(source.toString());

    }
}
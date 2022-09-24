package org.example;

import lombok.Data;

@Data
public class People {
    /**
     * 测试不同名称的属性关联
     */
    private String name;
    private int sex;
    private int age;
    /**
     * 测试不同类型的属性关联
     */
    private Long id;

    private String height;

    public People(){
        super();
    }
    public People(String name, int sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public People(String name, int sex, int age, Long id, String height) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.id = id;
        this.height = height;
    }
}

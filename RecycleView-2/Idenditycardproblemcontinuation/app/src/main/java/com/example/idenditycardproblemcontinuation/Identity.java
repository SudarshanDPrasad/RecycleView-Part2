package com.example.idenditycardproblemcontinuation;

public class Identity {
    private String name;
    private int age;
    private String profession;
    private int image;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }

    public int getImage() {
        return image;
    }

    public Identity(String name, int age, String profession, int image) {
        this.name = name;
        this.age = age;
        this.profession = profession;
        this.image = image;
    }
}

package br.com.nomadweb.springwebmvc.model;

import org.springframework.lang.NonNull;

import javax.validation.constraints.NotBlank;

public class Jedi {

    @NotBlank
    private String name;

    @NotBlank
    private String lastName;

    public Jedi(String name, String lastName) {

        this.name = name;
        this.lastName = lastName;

    }

    public Jedi() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = this.lastName;
    }
}

package br.com.tonsoft.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;

@Entity
public class Student extends AbstractEntity {
    @NotEmpty(message = "The student name field is required")
    private String name;

    @NotEmpty(message = "The student email field is required")
    @Email
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

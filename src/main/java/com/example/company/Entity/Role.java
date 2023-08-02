package com.example.company.Entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    public Long getId() {
        return id;
    }
    public Role(String name) {
        super();
        this.name = name;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Role() {

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
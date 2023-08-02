package com.example.company.Entity;

import java.util.Collection;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.persistence.JoinColumn;
import lombok.Data;

@Entity
@Data
@Table(name="user", uniqueConstraints=@UniqueConstraint(columnNames="email"))
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String UserName;
    private String email;
    private String adress;
    private int mobile;
    private String password;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Collection<Role> roles;

    public User(int userId, String userName, String email, String adress, int mobile,
                String password, Collection<Role> roles) {
        super();
        this.userId = userId;
        this.UserName = userName;
        this.email = email;
        this.adress = adress;
        this.mobile = mobile;
        this.password = password;
        this.roles = roles;
    }
    public Collection<Role> getRoles() {
        return roles;
    }
    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }
    public User() {
    }


}
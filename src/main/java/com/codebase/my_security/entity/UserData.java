package com.codebase.my_security.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Setter
    @Getter
    private String email;
    @Getter
    @Setter
    private String password;
    @Getter
    private String roles;
    @OneToMany(mappedBy = "created", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Student> student;

}


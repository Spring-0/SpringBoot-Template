package dev.spring93.SpringBootTemplate.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "_user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String email;
    private String password;

}

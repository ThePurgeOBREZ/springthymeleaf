package com.wldrmnd.socialnetwork.model;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cadet {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private UUID id;

    @Column(name = "role")
    private String role;

    @Column(name = "studyGroup")
    private String studyGroup;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;
}
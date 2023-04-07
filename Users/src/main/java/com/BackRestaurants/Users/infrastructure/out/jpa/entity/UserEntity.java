package com.BackRestaurants.Users.infrastructure.out.jpa.entity;

import com.BackRestaurants.Users.domain.model.RoleModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private  Long id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column (name = "",nullable = false)
    private String lastName;

    @Column (name = "id_document",nullable = false)
    private String idDocument;

    @Column (name = "email",nullable = false)
    private String email;

    @Column (name = "password",nullable = false)
    private String password;

    @ManyToOne  //muchas enfermedades puede tener 1 estudiante
    @JoinColumn(name = "id_role", nullable = false)
    private RoleEntity role;

}

package com.diool.referral.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="affiliate")
public class Affiliate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String mail;

    @Column(nullable = false, unique = true)
    private String code;

    @Column(nullable = false)
    private String passwd;

    @Column(nullable = false)
    private String statut;


}

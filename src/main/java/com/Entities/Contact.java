package com.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity

public class Contact {
    @Id
    private String id;
    private String name;
    private String phoneNumber;
    private String address;
    private String picture;
    @Column(length = 1000)
    private String description;

    private Boolean favorite = false;
    private String InstagramLink;

    @ManyToOne
    private User user;

}

package com.phegondev.EmailSendingAPI.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "emails")
@Data
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String recipient;
    private String subject;
    private String body;
}

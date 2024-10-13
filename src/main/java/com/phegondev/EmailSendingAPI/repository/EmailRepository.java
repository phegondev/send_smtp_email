package com.phegondev.EmailSendingAPI.repository;

import com.phegondev.EmailSendingAPI.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<Email, Long> {
}

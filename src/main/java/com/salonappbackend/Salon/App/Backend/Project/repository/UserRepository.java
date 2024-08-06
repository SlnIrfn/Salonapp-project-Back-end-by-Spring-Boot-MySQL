package com.salonappbackend.Salon.App.Backend.Project.repository;

import com.salonappbackend.Salon.App.Backend.Project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

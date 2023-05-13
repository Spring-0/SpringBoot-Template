package dev.spring93.SpringBootTemplate.repositories;

import dev.spring93.SpringBootTemplate.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

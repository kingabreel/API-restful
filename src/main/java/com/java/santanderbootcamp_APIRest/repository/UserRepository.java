package com.java.santanderbootcamp_APIRest.repository;

import com.java.santanderbootcamp_APIRest.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
}

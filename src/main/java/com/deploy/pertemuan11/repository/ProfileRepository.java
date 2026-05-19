package com.deploy.pertemuan11.repository;


import com.deploy.pertemuan11.model.profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProfileRepository extends JpaRepository<profile, String> {
}

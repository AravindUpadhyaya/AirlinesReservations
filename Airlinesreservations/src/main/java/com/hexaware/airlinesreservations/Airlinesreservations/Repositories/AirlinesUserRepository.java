package com.hexaware.airlinesreservations.Airlinesreservations.Repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.airlinesreservations.Airlinesreservations.models.AirlinesUser;

@Repository
@Transactional
public interface AirlinesUserRepository extends JpaRepository<AirlinesUser, Integer> {
}

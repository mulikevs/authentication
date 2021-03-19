package com.mulikevs.guestservice.repository;

import com.mulikevs.guestservice.service.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author mulikevs.
 */
@Repository
public interface GuestRepository extends JpaRepository<Guest, Long> {
}

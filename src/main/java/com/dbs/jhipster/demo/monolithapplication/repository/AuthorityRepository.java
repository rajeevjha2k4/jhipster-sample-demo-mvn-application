package com.dbs.jhipster.demo.monolithapplication.repository;

import com.dbs.jhipster.demo.monolithapplication.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}

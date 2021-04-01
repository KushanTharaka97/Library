package com.kushan.dea.Repository;

import com.kushan.dea.entity.Lending;

import org.springframework.data.repository.CrudRepository;

public interface LendingBooks extends CrudRepository<Lending, Long> {
    Lending findByISBN(int ISBN);
}

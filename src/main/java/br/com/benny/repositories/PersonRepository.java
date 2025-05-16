package br.com.benny.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.benny.model.Person;
// Pode funcionar sem a anotação @Repository, nova atualização já reconhece apensa pela extensão ao JpaRepository
@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{}

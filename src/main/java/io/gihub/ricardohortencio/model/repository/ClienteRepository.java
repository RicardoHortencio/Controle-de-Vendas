package io.gihub.ricardohortencio.model.repository;

import io.gihub.ricardohortencio.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Integer>
 {

}

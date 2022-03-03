package br.com.monktec.meusgastos.repository;

import br.com.monktec.meusgastos.entity.Gasto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface GastoRepository extends JpaRepository<Gasto, UUID> {
}

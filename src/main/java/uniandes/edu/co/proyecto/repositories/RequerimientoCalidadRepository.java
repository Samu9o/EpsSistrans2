package uniandes.edu.co.proyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uniandes.edu.co.proyecto.modelo.RequerimientoCalidad;

@Repository
public interface RequerimientoCalidadRepository extends JpaRepository<RequerimientoCalidad, Long> {
}
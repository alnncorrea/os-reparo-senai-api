package br.com.senai.osreparosenaiapi.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import br.com.senai.osreparosenaiapi.entity.TipoPeca;

public interface TipoPecaRepository extends JpaRepository<TipoPeca, Integer> {

	@Query(value = "SELECT tp " + "FROM TipoPeca tp " + "WHERE Upper(tp.descricao) LIKE Upper(:desc)")

	List<TipoPeca> listarPor(@Param("desc") String descricao);

}

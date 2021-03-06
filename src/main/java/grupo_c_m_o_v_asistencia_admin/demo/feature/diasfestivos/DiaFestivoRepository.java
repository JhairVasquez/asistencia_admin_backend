package grupo_c_m_o_v_asistencia_admin.demo.feature.diasfestivos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface DiaFestivoRepository extends CrudRepository<DiaFestivo, Long> {

    List<DiaFestivo> findAll();
    List<DiaFestivo> findByNameLikeIgnoreCase(String term);
    
}

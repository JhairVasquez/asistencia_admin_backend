package grupo_c_m_o_v_asistencia_admin.demo.feature.diasfestivos;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("dias_festivos")
public class DiaFestivo {

    @Id
    @Column("id_dia_festivo")
    private long dayId;

    @Column("nombre_dia_festivo")
    private String name;

    @Column("fecha_dia_festivo")
    private Timestamp date;

    private Timestamp created;
    private Timestamp updated;
    private boolean archived;
    private boolean enabled;
    
}

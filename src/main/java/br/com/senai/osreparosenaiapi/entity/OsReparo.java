package br.com.senai.osreparosenaiapi.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity(name = "OsReparo")
@Table(name = "pecas_reparos")
public class OsReparo {

	private Integer id;

	private Integer id_peca;

}

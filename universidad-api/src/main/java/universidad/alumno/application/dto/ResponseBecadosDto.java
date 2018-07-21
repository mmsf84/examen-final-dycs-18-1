package universidad.alumno.application.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import universidad.alumno.application.dto.deserializer.ResponseBecadosDtoDeserializer;
import universidad.common.application.dto.RequestBaseDto;

@JsonDeserialize(using = ResponseBecadosDtoDeserializer.class)
public class ResponseBecadosDto extends RequestBaseDto {

	private String alumno;
	private double mtoBeca;
	private String tipoAlumno;
	public String getAlumno() {
		return alumno;
	}
	public void setAlumno(String alumno) {
		this.alumno = alumno;
	}
	public double getMtoBeca() {
		return mtoBeca;
	}
	public void setMtoBeca(double mtoBeca) {
		this.mtoBeca = mtoBeca;
	}
	public String getTipoAlumno() {
		return tipoAlumno;
	}
	public void setTipoAlumno(String tipoAlumno) {
		this.tipoAlumno = tipoAlumno;
	}
	
	
}

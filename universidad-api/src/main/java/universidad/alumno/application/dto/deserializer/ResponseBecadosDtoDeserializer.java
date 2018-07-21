package universidad.alumno.application.dto.deserializer;

import java.io.IOException;
import java.math.BigDecimal;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import universidad.alumno.application.dto.BecadosDto;
import universidad.alumno.application.dto.ResponseBecadosDto;
import universidad.common.application.enumeration.AlumnoType;

public class ResponseBecadosDtoDeserializer extends JsonDeserializer<BecadosDto> {
	@Override
	public ResponseBecadosDto deserialize(JsonParser jsonParser, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		ResponseBecadosDto responseBecadosDto = null;
		
        return responseBecadosDto;
	}	
}

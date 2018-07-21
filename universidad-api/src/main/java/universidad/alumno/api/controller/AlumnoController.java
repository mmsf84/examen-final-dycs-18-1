package universidad.alumno.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import universidad.alumno.application.AlumnoApplicationService;
import universidad.common.api.controller.ResponseHandler;

@RestController
@RequestMapping("api/")
public class AlumnoController {
	
	@Autowired
	AlumnoApplicationService alumnoApplicationService;
	
	@Autowired
	ResponseHandler responseHandler;

	@RequestMapping(method = RequestMethod.POST, path = "calcularBeca", consumes = "application/json; charset=UTF-8", produces = "application/json; charset=UTF-8")
	public ResponseEntity<Object> calcularBeca() throws Exception {
		try {
			alumnoApplicationService.calcularBeca();
			return this.responseHandler.getOkCommandResponse("Consulta hecha!");
		} catch(IllegalArgumentException ex) {
			return this.responseHandler.getAppCustomErrorResponse(ex.getMessage());
		} catch(Exception ex) {
			return this.responseHandler.getAppExceptionResponse();
		}
	}
}

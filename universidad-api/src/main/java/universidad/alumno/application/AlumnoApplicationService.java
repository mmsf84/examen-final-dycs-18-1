package universidad.alumno.application;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import universidad.alumno.domain.repository.AlumnoRepository;


@Service()
public class AlumnoApplicationService {
	@Autowired
	private AlumnoRepository alumnoRepository;

	@Transactional
	public void calcularBeca() throws Exception {
		
	}
	
}

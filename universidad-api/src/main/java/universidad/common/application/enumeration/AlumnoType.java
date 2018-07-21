package universidad.common.application.enumeration;

public enum AlumnoType {
	PREGRADO {
        public String toString() {
            return "PREGRADO";
        }
    },
	MAESTRIA {
        public String toString() {
            return "MAESTRIA";
        }
    },
	DOCTORADO {
        public String toString() {
            return "DOCTORADO";
        }
    },
}

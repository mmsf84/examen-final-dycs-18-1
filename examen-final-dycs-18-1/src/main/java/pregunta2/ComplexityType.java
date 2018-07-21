package pregunta2;

public enum ComplexityType {
    Lineal {
        public String toString() {
            return "Lineal";
        }
    },
    Cuadratic {
        public String toString() {
            return "Cuadratic";
        }
    },
    Exponential {
        public String toString() {
            return "Exponential";
        }
    }
}

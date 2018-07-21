package pregunta1;

public enum SharerType {
    Facebook {
        public String toString() {
            return "Facebook";
        }
    },
    Twitter {
        public String toString() {
            return "Twitter";
        }
    },
    Reddit {
        public String toString() {
            return "Reddit";
        }
    }
}

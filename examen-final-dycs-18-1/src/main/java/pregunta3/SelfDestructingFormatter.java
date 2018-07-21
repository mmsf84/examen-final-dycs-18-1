package pregunta3;

public class SelfDestructingFormatter implements Formatter {

	@Override
	public String format(String message) {
		message = "☠" + message + "☠";
        return message;
	}

}

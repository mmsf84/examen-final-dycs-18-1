package pregunta3;

public class SecureEZFormatter implements Formatter {

	@Override
	public String format(String message) {
		message = message.substring(message.length() - 1) + message.substring(0, message.length() - 1);
        return message;
	}

}

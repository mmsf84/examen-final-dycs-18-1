package pregunta3;

public class QuickMessenger extends Messaging {
    
	private String mensaje;

    public QuickMessenger(Formatter formatter) {
        super(formatter);
    }
    

    public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	@Override
    public void send() {
        System.out.println("Message '" + formatter.format(mensaje) + "' sent via e-mail");
    }
}

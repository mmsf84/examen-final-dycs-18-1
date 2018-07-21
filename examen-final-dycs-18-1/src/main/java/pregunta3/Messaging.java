package pregunta3;

public abstract class Messaging {
	
	protected Formatter formatter;

    public Messaging(Formatter formatter) {
        this.formatter = formatter;
    }
    
	abstract public void send();

}

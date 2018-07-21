package pregunta1;

public class Sharer {
    
    public void shareEveryWhere(String message)
    {
        for (SharerType sharerType : SharerType.values()) {
            
        	//Patron Adapter de Clase
        	Sharing sharer = SharerFactory.FACTORY.getSharer(sharerType);
        	
        	//Patron Adapter de Objeto
        	//Sharing sharer = SharerFactory.FACTORY.getObjSharer(sharerType);
            
        	if (sharer != null) {
                sharer.share(message);
            }
        }
    }
    
    public void share(String message, SharerType sharerType)
    {
    	Sharing sharer = SharerFactory.FACTORY.getSharer(sharerType);
        sharer.share(message);
    }
}

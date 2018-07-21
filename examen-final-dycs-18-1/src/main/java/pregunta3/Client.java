package pregunta3;

public class Client {

    public static void main(String[] args) {
        String message = "Hello";
        
        Formatter fomatter1 = new EstandarFormatter();
        Formatter fomatter2 = new SecureEZFormatter();
        Formatter fomatter3 = new SelfDestructingFormatter();
        
        QuickMessenger quickMessenger = new QuickMessenger(fomatter1);
        quickMessenger.setMensaje(message);
        quickMessenger.send();
        System.out.println("*************************************************************");
        quickMessenger = new QuickMessenger(fomatter2);
        quickMessenger.setMensaje(message);
        quickMessenger.send();
        System.out.println("*************************************************************");
        quickMessenger = new QuickMessenger(fomatter3);
        quickMessenger.setMensaje(message);
        quickMessenger.send();        
        System.out.println("*************************************************************");
                
        VIPMessenger vipMessenger = new VIPMessenger(fomatter1);
        vipMessenger.setMensaje(message);
        vipMessenger.send();
        System.out.println("*************************************************************");
        vipMessenger = new VIPMessenger(fomatter2);
        vipMessenger.setMensaje(message);
        vipMessenger.send();
        System.out.println("*************************************************************");
        vipMessenger = new VIPMessenger(fomatter3);
        vipMessenger.setMensaje(message);
        vipMessenger.send();
        System.out.println("*************************************************************");
        
        EZMessenger eZMessenger = new EZMessenger(fomatter1);
        eZMessenger.setMensaje(message);
        eZMessenger.send();
        System.out.println("*************************************************************");
        eZMessenger = new EZMessenger(fomatter2);
        eZMessenger.setMensaje(message);
        eZMessenger.send();
        System.out.println("*************************************************************");
        eZMessenger = new EZMessenger(fomatter3);
        eZMessenger.setMensaje(message);
        eZMessenger.send();
        System.out.println("*************************************************************");
    }
}

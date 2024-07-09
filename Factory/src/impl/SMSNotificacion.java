package impl;

public class SMSNotificacion implements Notificacion{

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando mensaje SMS con el contenido: '"+mensaje+"'");
    }
}
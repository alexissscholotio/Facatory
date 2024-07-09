package impl;

public class AppNotificacion implements Notificacion {

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Este es una notificacion de la app con el contenido: '"+mensaje+"'");
    }
}
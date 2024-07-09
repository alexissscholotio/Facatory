package impl;

public class UrgenteNotificacionFactory implements NotificacionFactory{
    @Override
    public EmailNotificacion crearEmailNotificacion() {
        System.out.println("///URGENTE///");
        return new EmailNotificacion(){
            @Override
            public void enviarMensaje(String mensaje) {
                System.out.println("Enviando email urgente con el contenido: '"+mensaje+"'");
            }
        };
    }

    @Override
    public SMSNotificacion crearSMSNotificacion() {
        System.out.println("///URGENTE///");
        return new SMSNotificacion(){
            @Override
            public void enviarMensaje(String mensaje) {
                System.out.println("Enviando mensaje SMS urgente con el contenido: '"+mensaje+"'");
            }
        };
    }

    @Override
    public AppNotificacion crearAppNotificaccion() {
        System.out.println("///URGENTE///");
        return new AppNotificacion(){
            @Override
            public void enviarMensaje(String mensaje) {
                System.out.println("Este es una notificacion urgente de la app con el contenido: '"+mensaje+"'");
            }
        };
    }
}
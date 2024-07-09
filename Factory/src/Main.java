import exception.MessageTypeNotFoundException;
import impl.Notificacion;
import impl.RegularNotificacionFactory;
import impl.UrgenteNotificacionFactory;

public class Main {
    public static void main(String[] args) {
        try{

            Notificacion EmailNotify = NotificacionFactory.crearNotificacion("Email");
            EmailNotify.enviarMensaje("Reunion agendada para el dia viernes");

            Notificacion SMSNotify = NotificacionFactory.crearNotificacion("SMS");
            SMSNotify.enviarMensaje("Recordatorio de la reunion del viernes");

            Notificacion AppNotify = NotificacionFactory.crearNotificacion("App");
            AppNotify.enviarMensaje("Posiblemente se haran cambios en la fecha de la reunion");

            System.out.println();

            Notificacion EmailUrgente = new UrgenteNotificacionFactory().crearEmailNotificacion();
            EmailUrgente.enviarMensaje("La reunion se reagendo para el dia martes");

            System.out.println();

            Notificacion RegularSMS = new RegularNotificacionFactory().crearSMSNotificacion();
            RegularSMS.enviarMensaje("Recordatorio del cambio en el dia de la reunion");

        }catch (MessageTypeNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
}
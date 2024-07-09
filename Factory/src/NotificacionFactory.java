import exception.MessageTypeNotFoundException;
import impl.AppNotificacion;
import impl.EmailNotificacion;
import impl.Notificacion;
import impl.SMSNotificacion;

public class NotificacionFactory {
    public static Notificacion crearNotificacion(String tipo) throws MessageTypeNotFoundException{
        switch (tipo){
            case "Email":
                return new EmailNotificacion();

            case "SMS":
                return new AppNotificacion();

            case "App":
                return new SMSNotificacion();

            default:
                throw new MessageTypeNotFoundException("El tipo "+tipo+" no fue encontrado");
        }
    }
}
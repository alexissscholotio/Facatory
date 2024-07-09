package impl;

public interface NotificacionFactory {
    EmailNotificacion crearEmailNotificacion();
    SMSNotificacion crearSMSNotificacion();
    AppNotificacion crearAppNotificaccion();
}
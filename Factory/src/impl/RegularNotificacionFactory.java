package impl;

public class RegularNotificacionFactory implements NotificacionFactory{
    @Override
    public EmailNotificacion crearEmailNotificacion() {
        System.out.println("--Regular--");
        return new EmailNotificacion();
    }

    @Override
    public SMSNotificacion crearSMSNotificacion() {
        System.out.println("--Regular--");
        return new SMSNotificacion();
    }

    @Override
    public AppNotificacion crearAppNotificaccion() {
        System.out.println("--Regular--");
        return new AppNotificacion();
    }
}
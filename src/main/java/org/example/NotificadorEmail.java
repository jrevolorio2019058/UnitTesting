package org.example;

public class NotificadorEmail {

    private EmailCliente emailCliente;

    public NotificadorEmail(EmailCliente emailCliente) {
        this.emailCliente = emailCliente;
    }

    public void notificar(String direccion, String mensaje) {

        try{

            if (direccion == null || direccion.isEmpty()) {
                throw new IllegalArgumentException("Se necesita un correo de destinatario");
            }

            if(mensaje == null || mensaje.isEmpty()) {

                throw new IllegalArgumentException("No se permite un mensaje vacio");

            }

            emailCliente.enviar(direccion, mensaje);

        }catch (IllegalArgumentException e) {
            System.err.println("Error | " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Ocurrió un error inesperado: " + e.getMessage());
        }
    }

}

package org.example;

import org.example.interfaces.EmailClienteInterface;

public class EmailCliente implements EmailClienteInterface {

    @Override
    public void enviar(String destinatario, String mensaje) {
        try {
            if (destinatario == null || destinatario.isEmpty()) {
                throw new IllegalArgumentException("Se necesita un correo de destinatario");
            }

            if(mensaje == null || mensaje.isEmpty()) {

                throw new IllegalArgumentException("Se necesita un mensaje");

            }

            System.out.println("Destinatario: " + destinatario);
            System.out.println("Mensaje: " + mensaje);
            System.out.println("Enviado exitosamente");

        } catch (IllegalArgumentException e) {
            System.err.println("Error | " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Ocurrió un error inesperado: " + e.getMessage());
        }
    }
}

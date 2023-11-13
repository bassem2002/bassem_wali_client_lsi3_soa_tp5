package serveur;

import jakarta.xml.ws.Endpoint;
import service.BanqueService;

public class ServeurJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8088/", new BanqueService());

        System.out.println("web deployé sur http://localhost:8088/");
    }
}
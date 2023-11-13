package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import metier.Compte;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

@WebService(name="BS")
public class BanqueService {
    @WebMethod
    public double conversion (@WebParam double montant) {
        return montant*3.36;
    }
    @WebMethod
    public Compte GetCompte(@WebParam double code) {
        return new Compte(code,0,new Date());

    }
    @WebMethod
    public ArrayList<Compte> GetComptes(){
        ArrayList<Compte> cs = new ArrayList<>();
        cs.add(new Compte(1, 1000, new Date()));
        cs.add(new Compte(2, 1000, new Date()));

        return cs;

    }
}
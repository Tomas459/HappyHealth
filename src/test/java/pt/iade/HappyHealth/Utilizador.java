package pt.iade.HappyHealth;

import java.time.LocalDate; 

public class Utilizador extends Pessoa {
    public Utilizador(String nproprio, String apelido, LocalDate datanasc, String genero, int nif, char contactos){
        super(nproprio, apelido, data_nasc, genero, nif, contactos);
    }
    public String getnproprio () { return nproprio; }
    public void setnproprio(String nproprio) { this.nproprio = nproprio; }
    public String getapelido () { return apelido; }
    public void setapelido(String apelido) { this.apelido = apelido; }
    public LocalDate getdata_nasc () { return data_nasc; }
    public String getgenero() { return genero; }
    public void setgenero (String genero) { this.genero = genero; }
    public int getnif() { return nif; }
    public void setnif(Int nif) { this.nif = nif; }
    public char getcontactos() { return contactos; }
    public void setcontactos(char contactos) { this.contactos = contactos; 
    }
}
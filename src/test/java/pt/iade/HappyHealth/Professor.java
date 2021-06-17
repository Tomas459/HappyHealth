package pt.iade.HappyHealth;

import java.time.LocalDate;

public class Professor extends Pessoa{
    public Professor(String nproprio,String apelido,LocalDate datanasc, String genero, int nif, char contactos
    {
        super(nproprio,apelido,datanasc,genero,nif,contactos);
    }

    public String getnproprio () {return nproprio; }
    public void setnproprio(String nproprio){this.nproprio=nproprio;}
    public String getapelido(){return apelido}
    public void setapelido(String apelido){this.apelido=apelido;}
    public LocalDate getdatanasc () {return datanasc;}
    public String genero () {return genero; }
    public void setgenero (String genero){this.genero=genero;}
    public int nif () {return nif; }
    public void setnif (String nif){this.nif=nif;}
    public char contactos () {return contactos; }
    public void setcontactos (String contactos){this.contactos=contactos;}

}
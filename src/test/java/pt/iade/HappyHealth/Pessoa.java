package pt.iade.HappyHealth;

public class Pessoa {
    private String nproprio;
    private String apelido;
    private LocalDate datanasc; 
    private String genero;
    private int nif;
    private char contactos;

    public Pessoa(String nproprio, String apelido, LocalDate datanasc, String genero, int nif, char contactos){
        this.nproprio = nproprio;
        this.apelido = apelido;
        this.datanasc = datanasc;
        this.genero = genero;
        this.nif = nif;
        this.contactos = contactos;
    }
}
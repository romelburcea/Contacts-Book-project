/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contactAgenda;

/**
 *
 * @author Romel
 */
public class persoanaContact {

    private String nume;
    private String prenume;
    private String dataNasterii;
    private String NrTel;

    public persoanaContact(String nume, String prenume, String dataNasterii, String NrTel) {
        this.nume = nume;
        this.prenume = prenume;
        this.dataNasterii = dataNasterii;
        this.NrTel = NrTel;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setDataNasterii(String dataNasterii) {
        this.dataNasterii = dataNasterii;
    }

    public void setNrTel(String NrTel) {
        this.NrTel = NrTel;
    }


    

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getDataNasterii() {
        return dataNasterii;
    }

    public String getNrTel() {
        return NrTel;
    }

    @Override
    public String toString() {
        return nume + " " + prenume + "," + dataNasterii + "," + NrTel;
    }

    public boolean filtru(String filtru) {
        if (nume.toLowerCase().contains(filtru.toLowerCase())) {
            return true;
        }
        return false;
    }
}

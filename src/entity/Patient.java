package entity;

public class Patient extends People{
    private Area situation;
    private String coment;
    private HospitalArea area;

    public Patient(String name, String cpf, int idPeople, String email, String number, Area situation, String coment) {
        super(name, cpf, idPeople, email, number);
        this.situation = situation;
        this.coment = coment;
    }

    public Patient() {
    }

    public Patient(String name, String cpf, int idPeople, String email, String number, Area situation, String coment, HospitalArea area) {
        super(name, cpf, idPeople, email, number);
        this.situation = situation;
        this.coment = coment;
        this.area = area;
    }

    public Area getSituation() {
        return situation;
    }

    public void setSituation(Area situation) {
        this.situation = situation;
    }

    public String getComent() {
        return coment;
    }

    public void setComent(String coment) {
        this.coment = coment;
    }

    public HospitalArea getArea() {
        return area;
    }

    public void setArea(HospitalArea area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "situation=" + situation +
                ", coment='" + coment + '\'' +
                ", area=" + area +
                '}';
    }
}

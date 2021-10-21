package cr.ac.ucr.sa.domain;

public class unidadesacademicaselectivecourse {

    private int id;
    private int idunidadesacademicas;
    private int electivecourse;

    public unidadesacademicaselectivecourse(int id, int idunidadesacademicas, int electivecourse) {
        this.id = id;
        this.idunidadesacademicas = idunidadesacademicas;
        this.electivecourse = electivecourse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdunidadesacademicas() {
        return idunidadesacademicas;
    }

    public void setIdunidadesacademicas(int idunidadesacademicas) {
        this.idunidadesacademicas = idunidadesacademicas;
    }

    public int getElectivecourse() {
        return electivecourse;
    }

    public void setElectivecourse(int electivecourse) {
        this.electivecourse = electivecourse;
    }
}

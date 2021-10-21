package cr.ac.ucr.sa.domain;

public class electivecourse {

    private int id;
    private String sigla;
    private int ciclo;
    private int horaspractica;
    private String requisitos;
    private String corequisitos;
    private int creditos;
    private String areadisciplinaria;
    private String nombre;
    private int horasteoria;
    private int horaslaboratorio;
    private int horasteoricopracticas;
    private String electivo;
    private String descripcion;
    private String objetivogeneral;
    private String bibliografia;
    private String contenidos;


    public electivecourse(int id, String sigla, int ciclo, int horaspractica, String requisitos, String corequisitos, int creditos, String areadisciplinaria, String nombre, int horasteoria, int horaslaboratorio, int horasteoricopracticas, String electivo, String descripcion, String objetivogeneral, String bibliografia, String contenidos) {
        this.id = id;
        this.sigla = sigla;
        this.ciclo = ciclo;
        this.horaspractica = horaspractica;
        this.requisitos = requisitos;
        this.corequisitos = corequisitos;
        this.creditos = creditos;
        this.areadisciplinaria = areadisciplinaria;
        this.nombre = nombre;
        this.horasteoria = horasteoria;
        this.horaslaboratorio = horaslaboratorio;
        this.horasteoricopracticas = horasteoricopracticas;
        this.electivo = electivo;
        this.descripcion = descripcion;
        this.objetivogeneral = objetivogeneral;
        this.bibliografia = bibliografia;
        this.contenidos = contenidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public int getHoraspractica() {
        return horaspractica;
    }

    public void setHoraspractica(int horaspractica) {
        this.horaspractica = horaspractica;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public String getCorequisitos() {
        return corequisitos;
    }

    public void setCorequisitos(String corequisitos) {
        this.corequisitos = corequisitos;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getAreadisciplinaria() {
        return areadisciplinaria;
    }

    public void setAreadisciplinaria(String areadisciplinaria) {
        this.areadisciplinaria = areadisciplinaria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasteoria() {
        return horasteoria;
    }

    public void setHorasteoria(int horasteoria) {
        this.horasteoria = horasteoria;
    }

    public int getHoraslaboratorio() {
        return horaslaboratorio;
    }

    public void setHoraslaboratorio(int horaslaboratorio) {
        this.horaslaboratorio = horaslaboratorio;
    }

    public int getHorasteoricopracticas() {
        return horasteoricopracticas;
    }

    public void setHorasteoricopracticas(int horasteoricopracticas) {
        this.horasteoricopracticas = horasteoricopracticas;
    }

    public String getElectivo() {
        return electivo;
    }

    public void setElectivo(String electivo) {
        this.electivo = electivo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getObjetivogeneral() {
        return objetivogeneral;
    }

    public void setObjetivogeneral(String objetivogeneral) {
        this.objetivogeneral = objetivogeneral;
    }

    public String getBibliografia() {
        return bibliografia;
    }

    public void setBibliografia(String bibliografia) {
        this.bibliografia = bibliografia;
    }

    public String getContenidos() {
        return contenidos;
    }

    public void setContenidos(String contenidos) {
        this.contenidos = contenidos;
    }
}

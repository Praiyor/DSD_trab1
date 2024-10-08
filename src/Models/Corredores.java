package Models;

import java.util.ArrayList;
import java.util.List;

public class Corredores {

    private String torneio;
    private String premio;

    private List<Piloto> corredores = new ArrayList<>();
    private List<Tecnico> tecnicos = new ArrayList<>();

    public Corredores(String torneio, String premio){
        this.torneio = torneio;
        this.premio = premio;
    }

    public String getTorneio(){
        return this.torneio;
    }

    public void setTorneio(String torneio){
        this.torneio = torneio;
    }

    public String getPremio(){
        return this.premio;
    }

    public void setPremio(String premio){
        this.premio = premio;
    }

    public List<Piloto> getCorredores() {
        return corredores;
    }

    public void setCorredores(List<Piloto> corredores) {
        this.corredores = corredores;
    }

    public List<Tecnico> getTecnicos() {
        return tecnicos;
    }

    public void setTecnicos(List<Tecnico> tecnico) {
        this.tecnicos  = tecnico;
    }

    public void addTecnicos(Tecnico tecnicos) {
        this.tecnicos.add(tecnicos);
    }

    public void addPiloto(Piloto piloto) {
        this.corredores.add(piloto);
    }

    public boolean removePiloto(Piloto piloto) {
        return this.corredores.remove(piloto);
    }

    public boolean removeTecnico(Tecnico tecnico) {
        return this.tecnicos.remove(tecnico);
    }

    @Override
    public String toString() {
        return "Corredores: " +
                "torneio = '" + torneio + '\'' +
                ", premio = '" + premio + '\'';
    }
}

package com.company;

public class Terciario extends Titulo{
    private String tipoValidacion;

    public Terciario(Persona persona, Integer cantMaterias, String fechaInicioEstudios, String fechaFinEstudios,
                     Boolean selladoPorMinisterio, Boolean selladoPorInstituto, String tipoValidacion) {
        super(persona, cantMaterias, fechaInicioEstudios, fechaFinEstudios, selladoPorMinisterio, selladoPorInstituto);
        this.tipoValidacion = tipoValidacion;
    }

    public Boolean tieneValidezNacional(){
        if(tipoValidacion.equals("nacional")){
            return true;
        }
        return false;
    }
}

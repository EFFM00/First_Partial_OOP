package com.company;

public abstract class Titulo {

    private Persona persona;
    private Integer cantMaterias;
    private String fechaInicioEstudios;
    private String fechaFinEstudios;
    private Boolean selladoPorMinisterio;
    private Boolean selladoPorInstituto;

    public Titulo(Persona persona, Integer cantMaterias, String fechaInicioEstudios, String fechaFinEstudios,
                  Boolean selladoPorMinisterio, Boolean selladoPorInstituto) {
        this.persona = persona;
        this.cantMaterias = cantMaterias;
        this.fechaInicioEstudios = fechaInicioEstudios;
        this.fechaFinEstudios = fechaFinEstudios;
        this.selladoPorMinisterio = selladoPorMinisterio;
        this.selladoPorInstituto = selladoPorInstituto;
    }

    public Boolean puedeEjercer(){
        if(selladoPorInstituto.equals(true) && selladoPorMinisterio.equals(true)){
            return true;
        }
        return false;
    }
}

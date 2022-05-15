package com.company;

public class Licenciatura extends Titulo implements Comparable{
    private String temaTesis;
    private String fechaEntregaTesis;
    private Integer cantTrabajosInvestigacion;

    public Licenciatura(Persona persona, Integer cantMaterias, String fechaInicioEstudios, String fechaFinEstudios, Boolean selladoPorMinisterio, Boolean selladoPorInstituto, String temaTesis, String fechaEntregaTesis, Integer cantTrabajosInvestigacion) {
        super(persona, cantMaterias, fechaInicioEstudios, fechaFinEstudios, selladoPorMinisterio, selladoPorInstituto);
        this.temaTesis = temaTesis;
        this.fechaEntregaTesis = fechaEntregaTesis;
        this.cantTrabajosInvestigacion = cantTrabajosInvestigacion;
    }

    @Override
    public int compareTo(Object carrera) {

        Licenciatura licenciatura2 = (Licenciatura) carrera;
        int resultado = 0;

        if(this.cantTrabajosInvestigacion > licenciatura2.cantTrabajosInvestigacion){
            resultado = 1;
        }

        if (this.cantTrabajosInvestigacion < licenciatura2.cantTrabajosInvestigacion){
            resultado = -1;
        }
        return resultado;
    }
}

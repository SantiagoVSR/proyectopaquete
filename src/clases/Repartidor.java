/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import persistencia.Estados;

/**
 *
 * @author furai
 */
public class Repartidor {
    
    int idPaq;
    String Codigo;
    String descriccion;
    int Peso;
    int Alto;
    Estados estados;

    public Repartidor() {
    }

    public Repartidor(int idPaq, String Codigo, String descriccion, int Peso, int Alto) {
        this.idPaq = idPaq;
        this.Codigo = Codigo;
        this.descriccion = descriccion;
        this.Peso = Peso;
        this.Alto = Alto;
    }

    public int getIdPaq() {
        return idPaq;
    }

    public void setIdPaq(int idPaq) {
        this.idPaq = idPaq;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getDescriccion() {
        return descriccion;
    }

    public void setDescriccion(String descriccion) {
        this.descriccion = descriccion;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    public int getAlto() {
        return Alto;
    }

    public void setAlto(int Alto) {
        this.Alto = Alto;
    }

    @Override
    public String toString() {
        return "Paquete{" + "idPaq=" + idPaq + ", Codigo=" + Codigo + ", descriccion=" + descriccion + ", Peso=" + Peso + ", Alto=" + Alto + '}';
    }
}

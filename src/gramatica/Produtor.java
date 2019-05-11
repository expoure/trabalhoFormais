/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gramatica;

import java.util.ArrayList;

/**
 *
 * @author Fabricio
 */
public class Produtor {
    private String letras;
    private ArrayList geradores;
    
    public Produtor (){
        geradores = new ArrayList<>();
    }

    public String getLetras() {
        return letras;
    }

    public void setLetras(String letras) {
        this.letras = letras;
    }

    public ArrayList getGeradores() {
        return geradores;
    }

    public void setGeradores(ArrayList geradores) {
        this.geradores = geradores;
    }
    
    
    
}

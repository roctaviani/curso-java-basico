/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula52_labs_correcoesexercicios;

/**
 *
 * @author loiane
 */
public class AgendaCheiaExeption extends Exception {

    @Override
    public String getMessage() {
       return "Agenda já está cheia";
    }
 
}

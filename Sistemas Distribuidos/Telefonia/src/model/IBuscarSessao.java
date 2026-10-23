/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

import cliente.*;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.HashMap;
import model.Sessao;

/**
 *
 * @author luiza
 */
public interface IBuscarSessao extends Remote {
    
   public Sessao buscarSessao(String s, HashMap<String, Sessao> sessoes) throws RemoteException; 
   //public String carregarArquivoEmHashMap(String nomeArquivo, HashMap<String, Sessao> sessoes, StringBuilder dadosSessoes) throws RemoteException; 
   public HashMap<String, Sessao> carregarArquivoEmHashMap(String nomeArquivo) throws RemoteException;

}

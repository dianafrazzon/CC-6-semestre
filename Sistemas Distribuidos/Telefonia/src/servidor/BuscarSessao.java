/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.List;
import model.Sessao;
import model.IBuscarSessao;


/**
 *
 * @author luiza
 */
public class BuscarSessao extends UnicastRemoteObject implements IBuscarSessao {
    
    public BuscarSessao() throws RemoteException {
    }

    @Override
    public Sessao buscarSessao(String s, HashMap<String, Sessao> sessoes) throws RemoteException {
        return sessoes.get(s);
    }
    
//    @Override
//    public String carregarArquivoEmHashMap(String nomeArquivo, HashMap<String, Sessao> sessoes, StringBuilder dadosSessoes) {
//        try {
//            Path caminho = Paths.get(nomeArquivo);
//
//            // 1. Lê todas as linhas do arquivo de uma vez só (Java 8+)
//            List<String> linhas = Files.readAllLines(caminho);
//
//            // 2. Alimenta o StringBuilder e o HashMap em um único fluxo
//            for (String linha : linhas) {
//
//                // Adiciona a linha ao StringBuilder (mantendo a quebra de linha original)
//                dadosSessoes.append(linha).append(System.lineSeparator());
//
//                // Remove espaços e processa se não estiver vazia
//                if (!linha.trim().isEmpty()) {
//                    String[] dadosLinha = linha.split(";");
//
//                    if (dadosLinha.length >= 2) {
//                        Sessao sessao = new Sessao(dadosLinha[0], dadosLinha[1]);
//                        sessoes.put(sessao.getNumeroCelular(), sessao);
//                    }
//                }
//            }
//            return dadosSessoes.toString();
//        } catch (IOException e) {
//            //System.err.println();
//            return "Erro ao processar o arquivo: " + e.getMessage();
//        }
//    }
    
    @Override
    public HashMap<String, Sessao> carregarArquivoEmHashMap(String nomeArquivo) throws RemoteException {
        HashMap<String, Sessao> sessoes = new HashMap<>();
        try {
            List<String> linhas = Files.readAllLines(Paths.get(nomeArquivo));
            
            for (String linha : linhas) {
                
                if (!linha.trim().isEmpty()) {
                    String[] dados = linha.split(";");
                    
                    if (dados.length >= 2) {
                        Sessao s = new Sessao(dados[0], dados[1]);
                        sessoes.put(s.getNumeroCelular(), s);
                    }
                }
            }
        } catch (IOException e) {
            throw new RemoteException("Erro ao ler o arquivo: " + e.getMessage(), e);
        }
        return sessoes;
    }

}

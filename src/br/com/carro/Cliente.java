package br.com.carro;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket servidor = new Socket("localhost", 12345);
		PrintStream saidaDeDadosParaOServidor = new PrintStream(servidor.getOutputStream());
		Scanner entradaDadosDoServidor = new Scanner(servidor.getInputStream());
		Scanner leitor = new Scanner(System.in);
		String mensagem = "";
		while(!mensagem.equals("fim")){
			System.out.println("Digite sua mensagem para o servidor: ");
			mensagem = leitor.nextLine();
			saidaDeDadosParaOServidor.println(mensagem);
			String resposta = entradaDadosDoServidor.nextLine();
			System.out.println(resposta);
			
		}
		
		
		
	}
}

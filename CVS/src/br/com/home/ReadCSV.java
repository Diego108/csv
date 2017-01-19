package br.com.home;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {
	private BufferedReader br;
	private FileReader fr;
	
	
	public List<String> readFile(){
		try {
			br = new BufferedReader(new FileReader("/home/web6600/workspace/CVS/vip_bloqueio.csv"));
			String arq;
			List<String> lista = new ArrayList<>();
			
			while((arq = br.readLine())!=null){
				lista.add(arq);
			}
			return lista;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}
	
	public void parseFile(){
		List<String> lista = readFile();
		
		for (int i = 0; i < lista.size(); i++) {
			
			String nome = lista.get(i).split(";")[i];
			
			System.out.println(nome);
		}
	}
}

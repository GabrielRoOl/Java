package set.fixacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import set.fixacao.entities.LogEntry;

public class MainExercicio {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: "); // Já entrei com o caminho abaixo
		String path = ("C:\\Temp\\ws-eclipse\\set\\src\\set\\in.txt");
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			Set<LogEntry> set = new HashSet<>(); 
			
			String line = br.readLine();
			while(line != null) { 
				
				String[] fields = line.split(" ");// recorta uma string split
				String username = fields[0]; // aqui vai ser armazenado o nome
				Date moment = Date.from(Instant.parse(fields[1])); // armazenando as datas
				
				set.add(new LogEntry(username, moment));
				
				line = br.readLine();
			}
			
			System.out.println("Total users: " + set.size());
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		
		
		
		
		
		sc.close();
	}
}

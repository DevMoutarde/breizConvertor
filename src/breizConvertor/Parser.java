package breizConvertor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Parser {
	
	private int count = 0;
	private ArrayList<String> lignes = new ArrayList<String>();
	
	public Parser()
	{
		
	}
	
	
	public void lireFichier(String path)
	{
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(new File(path)));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String line;
		try {
			while ((line = br.readLine()) != null) {
				this.count++;
				this.lignes.add(line);
			   System.out.println(line);
			   System.out.println(count);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public ArrayList<String> getLignes() {
		return lignes;
	}


	public void setLignes(ArrayList<String> lignes) {
		this.lignes = lignes;
	}
	
	
	
	
	

}

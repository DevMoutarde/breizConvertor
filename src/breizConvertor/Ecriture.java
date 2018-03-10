package breizConvertor;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFileChooser;

public class Ecriture {
	
	private ArrayList<String> data;
	private String pathOutput;
	private Vue vue;
	
	public Ecriture(Vue vue, ArrayList<String> data)
	{
		this.vue = vue;
		this.data = data;
	}
	
	public void setPath() throws IOException
	{
		JFileChooser fichierSortie = new JFileChooser();
		int returnVal = fichierSortie.showOpenDialog(null);
	    if(returnVal == JFileChooser.APPROVE_OPTION) {
	       
	            this.pathOutput = fichierSortie.getSelectedFile().getCanonicalPath();
	            this.ecrire();
	    }

		
	}
	
	
	public void ecrire() throws IOException
	{
		FileWriter fichier = new FileWriter(this.pathOutput);
	       fichier.write ("[\n");
	       for(int i = 0; i <  this.data.size(); i++)
	       {
	    	   if(i == this.data.size()-1)
	    	   {
	    		   fichier.write(data.get(i)+"\n"); 
	    	   }
	    	   else
	    	   {
	    		   fichier.write(data.get(i)+",\n");   
	    	   }
	    	   
	       }
	       fichier.write ("]");
	fichier.close();
	}
	
	
	

}

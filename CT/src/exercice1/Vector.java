package exercice1;

import java.util.ArrayList;

public class Vector {

	public static Double norm( ArrayList <Double> v) {
		double norm = 0;
		int sizeV = v.size();
		for(int i = 0; i < sizeV; i++) {
			norm += v.get(i)* v.get(i);
		}
			
		return Math.sqrt(norm);
		
	}
	
	public static ArrayList <Double> scale(  ArrayList <Double> v, double k) {
		ArrayList <Double> w =  new 	ArrayList <Double> ();
		
		int sizeV = v.size();
		
		for(int i = 0; i<sizeV; i++) {
			w.add(i, k * v.get(i));
		}
		
	
		return w;
	}
	
	public static ArrayList <Double> normalize (ArrayList <Double> v) {
		ArrayList <Double> w =  new 	ArrayList <Double> ();

		for(int i = 0; i < v.size(); i++) {
			w.add(i, v.get(i)/Vector.norm(v));
		}
		
		return w;
	}	
	public static ArrayList <Double> add(ArrayList <Double> v, ArrayList <Double> w) throws Exception  {
		
		if(v.size() == w.size()) {
			ArrayList <Double> x = new ArrayList <Double>();
			
			for(int i = 0; i< v.size(); i++) {
				x.add(i, w.get(i) + v.get(i));
			}
			
			return x;
		} else 
		{
			throw new Exception("Vectors with different size");

		}
	}
}

package exercice2;

import java.util.ArrayList;

public class Seed <T extends ISeed>  {
	String label;
	ArrayList<T> elements =  new ArrayList <> ();
	
	
	 public Seed(String label) {
		 this.label = label;
	 }
	 
	 public void addElements(Seed seed) {
		 this.elements.add((T) seed);
	 }
	 
	 public void addElements(T[] elements) {
		 for (T item:elements) {
			 this.elements.add(item);
			}
	 } 
	 
	 public Seed getElement(int index) {
		 return this.getElement(index);
	 }
	 
	 public int getNbElements() {
		 return this.elements.size();
	 }
	 
	 public String toString() {
		 return label;
	 }
} 

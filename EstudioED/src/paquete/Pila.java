package paquete;

import java.util.ArrayList;

public class Pila {
	private ArrayList<Object> pila = new ArrayList <>();
	
	private void push(Object elemento) {
		pila.add(elemento);
	}
	
	private Object pop() {
		if(!pila.isEmpty()) {
			Object t = pila.get(pila.size()-1);
			pila.remove(pila.size()-1);
			return t;
		}
		else 
			return null;
	}
	
	private Object peek() {
		if(!pila.isEmpty()) {
			return pila.get(pila.size()-1);
		}
		else
			return null;
	}
	
	private Boolean empty() {
		return pila.isEmpty();
	}
	
	private int size() {
		return pila.size();
	}
	
	
	
	
	public static void main(String[] args){
		Pila pila = new Pila();
		pila.push("hola");
		pila.push(1);
		pila.push(3);
		pila.push("Nab");
		pila.push(123546);
		pila.push(true);
		pila.pop();
		System.out.println(pila.peek());
		System.out.println(pila.size());
		System.out.println(pila.empty());
		
	}
}

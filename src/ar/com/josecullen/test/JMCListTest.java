package ar.com.josecullen.test;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;

import ar.com.josecullen.interfaces.Listable;
import ar.com.josecullen.interfaces.Obtainable;
import ar.com.josecullen.util.RapidFrame;
import ar.josecullen.components.simple.JMCList;
import ar.josecullen.components.simple.JMCTextField;

public class JMCListTest {
	
	
	private static void getFrame(String title, Listable obt){
		JMCList jmct = new JMCList(obt);
		JPanel panel = new JPanel();
		panel.add(jmct);
		RapidFrame frame = new RapidFrame(panel, 300, 100);
		frame.setTitle(title);
	}
	
	
	
	
	public static void testWithString() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hola");
		list.add("Carola");
		list.add("caracola");
		
		Listable<String> obt = new Listable<String>() {		
			
			@Override
			public List<String> getList() {
				return list;
			}
			
		};		
		getFrame("Test With Strings", obt);
	}
	
	public static void testWithObject(){
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("José"));
		list.add(new Person("Carito"));
		list.add(new Person("Loquete"));
		
		
		Listable<Person> obt = new Listable<Person>() {

			@Override
			public List<Person> getList() {
				return list;
			}
			
		};	
		getFrame("Test With Object", obt);
		
	}
	
	
	public static void testWithAddAndRefresh(){
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		testWithString();
		testWithObject();		
	}
}





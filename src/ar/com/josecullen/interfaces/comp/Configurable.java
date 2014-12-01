package ar.com.josecullen.interfaces.comp;

import ar.com.josecullen.interfaces.Listable;
import ar.com.josecullen.interfaces.Manipulable;
import ar.com.josecullen.interfaces.Obtainable;

public interface Configurable<Value> extends Manipulable, Listable<Value>,
		Obtainable {

}

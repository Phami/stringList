package de.uni_koeln.info.java;

/**
 * Diese Klasse vereinfacht den Umgang mit einem Array, indem sie Methoden
 * implementiert, durch die das Array "dynamisch" wachsen kann.
 * 
 * Um die Objektvariablen, sowie die internen Methoden vor Zugriffen von außen
 * zu schützen, wurden sie als "private" deklariert.
 * 
 */
public class StringList {

	private String[] array;

	/**
	 * Die Position, an der das nächste Element, das eingefügt wird, gespeichert
	 * werden soll.
	 */
	private int nextInsert = 0;

	/**
	 * Konstruktor ohne Parameter (default-Konstruktor): Das Array wird auf eine
	 * Standard-Größe festgelegt.
	 */
	public StringList() {
		this.array = new String[16];
	}

	/**
	 * Zweiter Konstruktor: Erwartet als Parameter die initiale Größe des
	 * Arrays, was für große Listen vorteilhaft ist.
	 * 
	 * @param initialSize
	 */
	public StringList(int initialSize) {
		array = new String[initialSize];
	}

	/**
	 * Fügt den übergebenen String der Liste aller Strings hinzu.
	 * 
	 * @param string
	 */
	public void add(String string) {
		if (noSpaceAvailable()) {
			resizeArray();
		}
		array[nextInsert] = string;
		nextInsert++;
	}

	/**
	 * Gibt den String an der mit "position" referenzierten Stelle zurück.
	 * 
	 * @param position
	 * @return
	 */
	public String get(int position) {
		return array[position];
	}

	/**
	 * Gibt die Anzahl der Strings (Elemente), die im Array gespeichert sind,
	 * zurück (nicht die Länge des Arrays!!!).
	 * 
	 * @return
	 */
	public int size() {
		return nextInsert;
	}

	/**
	 * Prüft, ob ein weiterer String eingefügt werden kann, ohne dass das Array
	 * vergrößert werden muss.
	 * 
	 * @return true, falls kein Platz vorhanden ist, sonst false
	 */
	private boolean noSpaceAvailable() {
		if (nextInsert == array.length) {
			return true;
		}
		return false;
	}

	/**
	 * Vergrößert den verfügbaren Platz, indem ein neues Array erzeugt wird, der
	 * Inhalt des alten in das neue kopiert wird, und dieses schließlich der
	 * Objektvariablen "array" zugewiesen wird.
	 */
	private void resizeArray() {
		String[] neuesArray = new String[array.length * 2];
		System.arraycopy(array, 0, neuesArray, 0, array.length);
		array = neuesArray;
	}
	
	// HA 6
	public int contains(String string) {
		return -1;
	}
	
	public boolean remove(int index) {
		return false;
	}

}

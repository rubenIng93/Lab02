package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	
	List<Word> dictionary = new LinkedList<Word>();

	/*public AlienDictionary() {
		
		dictionary = new LinkedList<Word>();
		
	}*/
	
	public void addWord(String alienWord, String translation) {
		
		Word w = new Word(alienWord, translation);
		
			for(Word word : dictionary) {
				if(w.equals(word)) {
					word.setTranslation(translation);
					return;
				}
			}
			dictionary.add(w);
		}

	
	
	public String translateWord(String alienWord) {
		for(Word w : dictionary) {
			if(w.getAlienWord().compareTo(alienWord) == 0) {
				return w.getTranslation();
			}
		}
		return null;
	}
	
	

}

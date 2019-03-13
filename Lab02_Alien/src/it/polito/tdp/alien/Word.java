package it.polito.tdp.alien;

public class Word {
	
	private String alienWord;
	private String translation;
	
	public Word(String alienWord, String translation) {
		super();
		this.alienWord = alienWord;
		this.translation = translation;
	}



	public String getAlienWord() {
		return alienWord;
	}



	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}



	public String getTranslation() {
		return translation;
	}



	public void setTranslation(String translation) {
		this.translation = translation;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if (alienWord == null) {
			if (other.alienWord != null)
				return false;
		} else if (!alienWord.toLowerCase().equals(other.alienWord.toLowerCase()))
			return false;
		return true;
	}

	/*public boolean equals (Object obj) {
		String other = (String) obj;
		if(this.alienWord.toLowerCase().compareTo(other.toLowerCase()) == 0)
			return true;
		else 
			return false;
	}*/
	
	
	
	

}

package com.coderbd;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	@Autowired
	private SpellChecker spellChecker;

	public void spellCheck() {

		spellChecker.checkSpelling();
	}
}
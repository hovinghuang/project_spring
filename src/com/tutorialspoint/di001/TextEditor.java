package com.tutorialspoint.di001;

public class TextEditor {
	   private SpellChecker spellChecker;
	   /*基于构造函数的依赖注入*/ 
	   TextEditor(SpellChecker spellChecker) {
	      System.out.println("基于构造函数的依赖注入" );
	      this.spellChecker = spellChecker;
	   }
	   public void spellCheck() {
	      spellChecker.checkSpelling();
	   }
}

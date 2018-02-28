package com.coderbd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
   public static void main(String[] args) {
      ApplicationContext context = new AnnotationConfigApplicationContext(TestConfig.class);
      TextEditor te = (TextEditor) context.getBean(TextEditor.class);
      te.spellCheck();
   }
}
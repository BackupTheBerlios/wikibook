package de.bastie.wiki.book.sample.screenshot;

import javax.swing.JFrame;
 
/**
 * Klasse für den Wikibook Screenshot JFrame
 * @author Bastie - Sebastian Ritter
 */
public class Fenster {

  public static void main (final String [] ignored) {
    JFrame fenster = new JFrame ("WikiBooks");
    fenster.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    fenster.setSize(150,100);
    fenster.setVisible(true);
  }
}

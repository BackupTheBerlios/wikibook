package de.bastie.wiki.book.sample.screenshot;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Klasse für den Wikibook Screenshot JLabel
 * @author Bastie - Sebastian Ritter
 * @version 1.0
 */
public class Beschriftung {

  public static void main (final String [] ignored) {
    JLabel beschriftung = new JLabel ("WikiBooks");
    beschriftung.setFont(new Font ("SansSerif", Font.BOLD + Font.ITALIC, 18));
    beschriftung.setIcon (new ImageIcon(Beschriftung.class.getResource("WikiBooksW.png")));
    beschriftung.setToolTipText("Ein JLabel Objekt");

    final JFrame fenster = new JFrame (); // irgendwo muss der JLabel ja 'rauf
    fenster.setUndecorated(true);         // keine Titelleiste
    fenster.getContentPane().add (beschriftung);
    fenster.pack();
    fenster.setVisible(true);
    
    try {
      Thread.sleep(5000);                 // 5 Sekunden für den Screenshot
    }
    catch (final Throwable ignore) {}     // Fehler interessieren uns nicht
    finally {                             // auf jeden Fall mache folgendes
      System.exit(0);                     // Beende die Anwendung
    }
  }
}

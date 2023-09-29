package Getter_Setter;
import java.awt.Desktop;//the Desktop class allows interact with various desktop capabilities.
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import javax.swing.JOptionPane;
public class BirthdayWishWithSong {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        // Play the birthday song
        playBirthdaySong();

        // Display a birthday message
        JOptionPane.showMessageDialog(null, "Happy Birthday! Vishal Bhai🎉");

        // Open a file containing the Java code
        openJavaCodeFile();
    }

    public static void playBirthdaySong() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File audioFile = new File("C:/Users/khushboo shivhare/OneDrive/Pictures/resume/vishal.wav"); // Replace with the
                                                                                                     // actual path to
                                                                                                     // your birthday
                                                                                                     // song file
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
    }

    public static void openJavaCodeFile() throws IOException {
        File codeFile = new File(
                "C:\\Users\\khushboo shivhare\\IdeaProjects\\learnj\\src\\main\\java\\Getter_Setter\\BirthdayWishWithSong.java"); /* Replace
                                                                                                                                  with the  actual path to
                                                                                                                                   your  Java code  file*/
        Desktop.getDesktop().open(codeFile);
    }
}

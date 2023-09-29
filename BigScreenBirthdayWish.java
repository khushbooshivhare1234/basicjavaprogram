package Getter_Setter;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class BigScreenBirthdayWish {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Happy Birthday Meghna!");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setUndecorated(true); // Removes window decorations (title bar, etc.)
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // Opens in full-screen mode
            frame.setAlwaysOnTop(true); // Makes it always on top of other windows
            JLabel label = new JLabel("Happy Birthday Meghna");
            label.setFont(new Font("Arial", Font.PLAIN, 72));
            label.setForeground(Color.RED);
            label.setHorizontalAlignment(JLabel.CENTER);
            label.setVerticalAlignment(JLabel.CENTER);
            frame.getContentPane().add(label);
            // Close the window after a few seconds (e.g., 10 seconds)
            Timer timer = new Timer(10000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.dispose(); // Close the window after the specified time
                }
            });
            timer.setRepeats(false); // Only trigger the timer once
            timer.start();
            frame.setVisible(true);
        });
    }
}

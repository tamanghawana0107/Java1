import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Stopwatch extends JFrame {

    private JLabel timeLabel;
    private Timer timer;
    private long startTime;

    public Stopwatch() {
        setTitle("Stopwatch");
        setSize(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        timeLabel = new JLabel("00:00:00");
        timeLabel.setFont(new Font("Arial", Font.PLAIN, 24));
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(timeLabel, BorderLayout.CENTER);

        JButton startButton = new JButton("Start");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startTimer();
            }
        });

        JButton stopButton = new JButton("Stop");
        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stopTimer();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(startButton);
        buttonPanel.add(stopButton);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTimer();
            }
        });
        timer.start();
    }

    private void stopTimer() {
        timer.stop();
    }

    private void updateTimer() {
        long currentTime = System.currentTimeMillis();
        long elapsedTime = currentTime - startTime;

        int seconds = (int) (elapsedTime / 1000) % 60;
        int minutes = (int) (elapsedTime / (1000 * 60)) % 60;
        int hours = (int) (elapsedTime / (1000 * 60 * 60));

        String timeString = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        timeLabel.setText(timeString);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Stopwatch().setVisible(true);
        });
    }
}

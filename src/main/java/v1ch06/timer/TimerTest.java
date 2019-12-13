package v1ch06.timer;

import javax.swing.*;
import java.awt.event.ActionListener;

public class TimerTest {
    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(10000, listener);
        t.start();

        JOptionPane.showMessageDialog(null, "QUIT PROGRAM?");
        System.exit(0);
    }
}

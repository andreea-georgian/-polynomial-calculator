import javax.swing.*;

public class RemainderMessage {
    JFrame frame;
    RemainderMessage(String remainder) {
        frame = new JFrame();
        JOptionPane.showMessageDialog(frame, "Restul impartirii polinoamelor este: " + remainder);
    }
}

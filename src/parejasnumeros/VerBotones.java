package parejasnumeros;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

public class VerBotones extends Thread{
    JButton b1;
    JButton b2;
    
    VerBotones(JButton b1, JButton b2)
    {
        this.b1=b1;
        this.b2=b2;
    }
    
    public void run()
    {
         if (b1.getText().compareTo(b2.getText())!=0)
            {
                 try {
                Thread.sleep(400);
            } catch (InterruptedException ex) {
                Logger.getLogger(Marco.class.getName()).log(Level.SEVERE, null, ex);
            }
                b1.setText(null);
                b2.setText(null);
            }
    }
    
}

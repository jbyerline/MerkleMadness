import javax.swing.*;

public class MerkleManager {

    public static volatile String sUserEntry;
    public static String sExpectedMerkle;
    public static String sMerkleRoot = null;
    public static int iStrikes = 0;

    public void manage() {

        Util oUtil = new Util();

        sExpectedMerkle = JOptionPane.showInputDialog("Enter Expected Merkle Root: ");

        MerkleThread oMerkle1 = new MerkleThread();
        oMerkle1.sThreadName1 = "Merkle Thread";
        Thread oThread1 = new Thread(oMerkle1);
        // Spawn off new thread
        oThread1.start();

        RogueThread oRogue1 = new RogueThread();
        oRogue1.sThreadName1 = "Rogue Thread";
        Thread oThread2 = new Thread(oRogue1);
        // Spawn off new thread
        oThread2.start();

        MonitorThread oMonitor1 = new MonitorThread();
        oMonitor1.sThreadName2 = "Monitor Thread";
        Thread oThread3 = new Thread(oMonitor1);
        // Spawn off new thread
        oThread3.start();

        while (true){

            sUserEntry = JOptionPane.showInputDialog("Enter Word: ");

        }

    }

    public static synchronized String grabWord(){

        String temp = sUserEntry;
        sUserEntry = null;

        return temp;
    }

}

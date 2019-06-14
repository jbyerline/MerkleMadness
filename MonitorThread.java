public class MonitorThread implements Runnable{

    String sThreadName2;

    public void run(){

        while(true){
            if(MerkleManager.sMerkleRoot != null){
                if(MerkleManager.sMerkleRoot == MerkleManager.sUserEntry){
                    System.out.println("You win! Merkle Root: " + MerkleManager.sMerkleRoot);
                    System.exit(0);
                }
                else{
                    System.out.println("You Lost :( ");
                    System.exit(0);
                }
            }
            else if(MerkleManager.iStrikes == 3){
                System.out.println("3 Strikes, You're out!");
                System.exit(0);
            }

            Util oUtil = new Util();
            oUtil.sleepRandomTime(sThreadName2);
        }
    }

}

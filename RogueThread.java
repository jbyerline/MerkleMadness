public class RogueThread implements Runnable{

    String sThreadName1;

    public void run(){
        Util oUtilRogue = new Util();

        while (true){

            oUtilRogue.sleepRandomTime(sThreadName1);
            String sNewWord = MerkleManager.grabWord();

            if(sNewWord != null){
                MerkleManager.iStrikes++;
                System.out.println("STRIKE!");
            }
        }
    }
}

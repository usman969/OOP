public class Text {
    private String[] para;
    private int currentPara;

    public Text(){
       para = new String[50];
    }
    public Text(String[] para,int currentPara){
        para = new String[50];
        this.currentPara = currentPara;
    }
    public void addPara(String newPara){
        para[currentPara] = newPara;
        currentPara++;
    }
    public int getCurrentPara(){
        return currentPara;
    }
    public void resetCurrentPara(){
        currentPara--;
        para[getCurrentPara()] = null;

    }
}

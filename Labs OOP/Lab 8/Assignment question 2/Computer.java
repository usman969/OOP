public class PC {
    protected double word_size;
    protected double memory_size;
    protected double storage_size;
    protected double speed;
    public PC(){
        word_size = 0;
        memory_size = 0;
        storage_size = 0;
        speed = 0;
    }
    public PC(double ws, double ms, double ss, double speed){
        this.word_size = ws;
        this.memory_size = ms;
        this.storage_size = ss;
        this.speed = speed;
    }

    public void setWord_size(double word_size) {
        this.word_size = word_size;
    }
    public void setMemory_size(double memory_size) {
        this.memory_size = memory_size;
    }
    public void setStorage_size(double storage_size) {
        this.storage_size = storage_size;
    }
    public void setspeed(double speed) {
        this.speed = speed;
    }
    public double getWord_size() {
        return word_size;
    }
    public double getMemory_size() {
        return memory_size;
    }
    public double getStorage_size() {
        return storage_size;
    }
    public double getspeed() {
        return speed;
    }
    public void display(){
        System.out.println("Word size = "+word_size+" bits.\nMemory size= "+memory_size+" megabytes.\n" +
                "Storage size = "+storage_size+" megabytes.\nspeed = "+speed+" megahertz");
    }
}

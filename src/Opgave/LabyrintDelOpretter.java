package Opgave;

public class LabyrintDelOpretter {

    int bund;
    int top;
    int venstre;
    int højre;

    public LabyrintDelOpretter(int bund, int top, int venstre, int højre){
        this.bund=bund;
        this.top=top;
        this.venstre=venstre;
        this.højre=højre;
    }

    @Override
    public String toString() {
        return "LabyrintDelOpretter{" +
                "bund=" + bund +
                ", top=" + top +
                ", venstre=" + venstre +
                ", højre=" + højre +
                '}';
    }
}

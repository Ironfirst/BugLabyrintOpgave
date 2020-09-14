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

    public LabyrintDelOpretter(){

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

    public void setBund(int bund) {
        this.bund = bund;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public void setVenstre(int venstre) {
        this.venstre = venstre;
    }

    public void setHøjre(int højre) {
        this.højre = højre;
    }
}

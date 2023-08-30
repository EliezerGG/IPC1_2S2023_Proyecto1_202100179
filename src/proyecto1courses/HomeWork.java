package proyecto1courses;


public class HomeWork {
    private String nameHW;
    private String descripHW;
    private int ponderacionHW;
    private int averageHW;
    private double nota;

    public HomeWork(){}
    
    public HomeWork(String nameHW, String descripHW, int ponderacionHW, double nota) {
        this.nameHW = nameHW;
        this.descripHW = descripHW;
        this.ponderacionHW = ponderacionHW;
        this.nota = nota;
    }

    public HomeWork(int averageHW) {
        this.averageHW = averageHW;
    }

    public String getNameHW() {
        return nameHW;
    }

    public void setNameHW(String nameHW) {
        this.nameHW = nameHW;
    }

    public String getDescripHW() {
        return descripHW;
    }

    public void setDescripHW(String descripHW) {
        this.descripHW = descripHW;
    }

    public int getPonderacionHW() {
        return ponderacionHW;
    }

    public void setPonderacionHW(int ponderacionHW) {
        this.ponderacionHW = ponderacionHW;
    }

    public int getAverageHW() {
        return averageHW;
    }

    public void setAverageHW(int averageHW) {
        this.averageHW = averageHW;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    
}


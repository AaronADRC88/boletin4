package boletin4;

public class Consumo {
    public double km;
    public double litros;
    public double vmed;
    public double pGas;
    public double Tempo;
    //connstruc
    public  Consumo(){
        
    }
   public Consumo(double d, double l , double v, double g){
        km=d;
        litros=l;
        vmed=v;
        pGas=g;
        
        } 
    public double getTempo(){
        return Tempo;
        }
    public double consumoMedio(double litros ,double km ){
    double consumoMedio=(litros*(km/100));
    return consumoMedio;
    }
    public double consumoEuros(double pGas , double km){
    double consumoEuros=(pGas*(km/100));
    return consumoEuros;
    }
    public void setKm(double Km){
        this.km=Km;
    }
    public void setLitros(double Litros){
        this.litros=Litros;
    }public void setVmed(double Vmed){
        this.vmed=Vmed;
    }public void setPGas(double PGas){
        this.pGas=PGas;
    }
}

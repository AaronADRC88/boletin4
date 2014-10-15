//consumo coche
package boletin4;

/**
 *
 * @author aferreiradominguez
 */
public class Boletin4 {

    public static void main(String[] args) {
        Consumo consumo1=new Consumo();
        Consumo consumo2=new Consumo(7,5,8,7);
        System.out.println("distancia percorrida="+consumo2.km+"\n"+"combustible consumido="+consumo2.litros+"\n"+"velocidade media="+consumo2.vmed+"\n"+"prezo gasolina="+consumo2.pGas);
        //probo os sets
        consumo2.setKm(10);
        consumo2.setLitros(20);
        consumo2.setVmed(50);
        consumo2.setPGas(1.50);
        System.out.println("distancia percorrida="+consumo2.km+"\n"+"combustible consumido="+consumo2.litros+"\n"+"velocidade media="+consumo2.vmed+"\n"+"prezo gasolina="+consumo2.pGas);
        System.out.println("gasto en €="+consumo2.consumoEuros(1.5,10));
        System.out.println("consumoMedio="+consumo2.consumoMedio(5,10));
        
        
        
    }
    
}

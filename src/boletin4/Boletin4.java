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
        consumo2.setLitros(50);
        consumo2.setVmed(50);
        consumo2.setPGas(1.57);
        System.out.println("distancia percorrida="+consumo2.km+"\n"+"combustible consumido="+consumo2.litros+"\n"+"velocidade media="+consumo2.vmed+"\n"+"prezo gasolina="+consumo2.pGas);
        System.out.println("gasto en €="+consumo2.consumoEuros(1.5,10));
        System.out.println("consumoMedio="+consumo2.consumoMedio(50, 100));
        System.out.println("Velocidade media="+consumo2.vmed);
        
/*a)    Crea un obxecto, de tipo consume, utilizando o constructor sen parámetros
b)    Dalle a litros o valor 50 e a prezo da gasolina 1.57
c)    Crea un obxecto, tipo consumo, utilizando o contructor con todos os parámetros
d)    Visualiza, a  través do 2º obxecto, o consumo medio
e)    Varia o valor dos litros consumidos do 2º obxecto.
f)     Visualiza a velocidade media do 2º obxecto.*/
        //
        
        
        
        
    }
    
}

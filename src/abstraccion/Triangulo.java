/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;


public class Triangulo extends Figura implements OperacionesGeometricas{
 float base;
 float altura;

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if(altura<0)altura=-altura;
        
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        float area=(base*altura)/2;
        setValorArea(area); 
    }

    @Override
    public void calcularPerimetro() {
        //Calculamos el perimetro del triangulo
      
        
        double perimetro=altura+base+Math.sqrt(Math.pow(altura, 2)+Math.pow(base,2));
        setValorPerimetro((float) perimetro); 
        
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;


public class Cuadrado extends Figura implements OperacionesGeometricas{
    float lado;

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        //Calculamos el area
        float area=lado*lado;
        setValorArea(area); 
    }

    @Override
    public void calcularPerimetro() {
        //Calculamos perimetro del cuadrado
        float perimetro=lado*4;
        setValorPerimetro(perimetro); 
    }
   

  
    

}

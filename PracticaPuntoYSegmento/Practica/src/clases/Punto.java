package clases;

public class Punto {
	 /**
	  * Atributos
	  */
	int x;
   int y;

   /**
    * Constructor
    */
   public Punto() {
       this.x = 0;
       this.y = 0;
   }
   /**
    * Constructor con los parámetros x e y
    * @param x Coordenada del punto x
    * @param y Coordenada del punto y
    */
   public Punto(int x, int y) {
       this.x = x;
       this.y = y;
   }
   /**
    * Obtiene la coordenada y del punto.
    * 
    * @return La coordenada y.
    */
   public int getX() {
       return x;
   }

   /**
    * Pone la coordenada x del punto.
    * @param x La nueva coordenada del punto x.
    */
   public void setX(int x) {
       this.x = x;
   }

   /**
    * Obtiene la coordenada y del punto.
    * @return La coordenada y.
    */
   public int getY() {
       return y;
   }

   /**
    * Pone la coordenada y del punto.
    * @param y La nueva coordenada del punto y.
    */
   public void setY(int y) {
       this.y = y;
   }

   /**
    * Nos devuelve una cadena de punto.
    * @return Una cadena en x e y.
    */
   @Override
   public String toString() {
       return "(" + x + ", " + y + ")";
   }
}

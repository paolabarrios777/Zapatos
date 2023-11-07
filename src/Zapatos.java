public class Zapatos {
    String color;
    String marca;
    int talla;

    public static void main(String[] args) {
        Zapatos zapato1= new Zapatos();

        zapato1.color="blanco";
        zapato1.marca="nike";
        zapato1.talla=38;

        System.out.println("el color de sus zapatos es:"+zapato1.color);
        System.out.println(" la marca de sus zapatos es:"+zapato1.marca);
        System.out.println(" la talla de sus zapatos es :"+zapato1.talla);


        Zapatos zapato2= new Zapatos();

        zapato2.color="negro";
        zapato2.marca="adidas";
        zapato2.talla=40;

        System.out.println("el color de sus zapatos es:"+zapato2.color);
        System.out.println(" la marca de sus zapatos es:"+zapato2.marca);
        System.out.println(" la talla de sus zapatos es :"+zapato2.talla);

        Zapatos zapato3= new Zapatos();

        zapato3.color="rojo";
        zapato3.marca="rebook";
        zapato3.talla=39;

        System.out.println("el color de sus zapatos es:"+zapato3.color);
        System.out.println(" la marca de sus zapatos es:"+zapato3.marca);
        System.out.println(" la talla de sus zapatos es :"+zapato3.talla);
    }
}
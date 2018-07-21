package pregunta4;

public class Client {

    public static void main(String[] args) {
        //Sandwich sanguche = new LargeBreadSandwich();
    	Sandwich sanguche = new SmallBreadSandwich();
    	sanguche = new Egg(sanguche);
    	//sanguche = new Chicken(sanguche);
    	sanguche = new Beef(sanguche);
    	//sanguche = new Bacon(sanguche);
    	sanguche = new Turkey(sanguche);

        System.out.println(sanguche.getIngrediente());
    }
}

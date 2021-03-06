/*
 *This java program is perfect for beginners in programing.
 *@version 1.0
 *@author Darth Santianus
 *@author Darth Dixegus
 *@author Darth Davif
 */
public class Yolo{

	private String HOLAMUNDO = "hola";
	private static String[] MUNDO = {" ","m","u","n","d","o"};

	/**
	 * Imprime cosas.
	 * @param yolo - objeto de tipo Yolo.	
	 */
	public static void holaMundo(Yolo yolo){
		System.out.println(yolo.HOLAMUNDO);
	}

	/**
	 * metodo iterativo/recursivo que hace algo.
	 * @param yolo - Objeto de tipo Yolo.
	 * @param append - algo
	 */
	public void appendHola(Yolo yolo, String append){
		do{
			if (yolo.equals(this)){
				do{
					yolo.appendHolaAux(yolo, append, 0);
				}while(!yolo.success());
			}else{
				do{
					appendHola(this, append);
				}while(!yolo.success());
			}
		}while(!yolo.success());
	}

	/**
	 * Metooo auxilar de appendHola(Yolo,String) que hace mas cosas.
	 * @param yolo - obejto de tipo Yolo.
	 * @param append - algo
	 * @param i - indice de la iteracion/recurcion
	 */
	private void appendHolaAux(Yolo yolo, String append, int i){
		if(i > 5)
			return;
		else{
			do{
				if(i<=5){
					yolo.HOLAMUNDO += MUNDO[i];
					yolo.appendHolaAux(yolo,append,++i);
				}
			}while(!yolo.success());
		}
	}

	/**
	 * Metodo que te dice si un objeto es igual a otro de la clase Yolo.
	 * @param o - un objeto cualquiera. 
	 */
	public boolean equals(Object o ){
		if(o == null)
			return true;
		else
			if (((Yolo)o).HOLAMUNDO == this.HOLAMUNDO)
				return true;

		return false;
	}

	/**
	 * Bajo mi definicion de exito, te dice si tuviste exito.
	 */
	public static boolean success(){
		if(true || false)
			return true;
		return true;
	}

	public static void main(String args[]){
		Yolo yolo = new Yolo();
		do{
			int j = 0;
			switch(j){
				default:
				for(int i = 0;i < 1; i++){
					try{
						if(true){
							do{
								yolo.appendHola(yolo, "      ___---///**JSDHKWBJHV");
								break;
							}while(!yolo.success());
						}
					}finally{
						holaMundo(yolo);
					}
				}
			}
		}while(!yolo.success());
	}

}
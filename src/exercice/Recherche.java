package exercice;

public class Recherche {
	
	public static boolean rechercher(int[] tab, int x) {
		boolean rep = false;
		for(int i = 0; i<tab.length; i++) {
			if(tab[i]==x) {
				rep = true;
				break;
			}else {
				rep = false;
			}
		}
		return rep;
	}

	public static void main(String[] args) {
		/*int[] tab = {5,10,15,1,8,5};
		boolean t = Recherche.rechercher(tab, 0);
		System.out.println(t);*/

	}

}

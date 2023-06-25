
public class Main {

	public static void main(String[] args) {

		Lista l = new Lista();
		l.insere(1,156);
		l.insere(2,450);
		l.insere(3,337);
		
		System.out.print("Lista: ");
		for(int i = 1 ; i <= l.tamanho() ; i++) {	
			System.out.print(l.elementoInPos(i) + ", ");
		}
		System.out.println();
		
		//verificando se a lista está vazia
		System.out.println("Vazia?  " + l.verificaVazia());
		
		//Obtendo o tamanho da lista
		System.out.println("Tamanho: " + l.tamanho());
		
		//modificando um elemento da lista
		l.mudaElemento(25, 2);
		System.out.print("Lista atualizada: ");
		for(int i = 1 ; i <= l.tamanho() ; i++) {	
			System.out.print(l.elementoInPos(i) + ", ");
		}
		//Removendo um elemento da lista
		l.remove(1);
		System.out.print("\nLista com o elemento removido: ");
		for(int i = 1 ; i <= l.tamanho() ; i++) {	
			System.out.print(l.elementoInPos(i) + ", ");
		}
		
	}

}
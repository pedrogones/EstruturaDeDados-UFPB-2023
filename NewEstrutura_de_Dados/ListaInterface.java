public interface ListaInterface {
    //Retorna true se a lista estiver vazia e false se estiver cheia
	public boolean verificaVazia();
	
	//Retorna true se a lita estiver cheia e false se estiver vazia
	public boolean verificaCheia();
	
	//Retorna o tamanho atual da lista
	public int tamanho();
	
	//Mostra o elemento contido na posição inserida
	public int elementoInPos(int pos);
	
	//Retorna a posição, na lista, do dado inserido
	public int posição(int dado);
	
	//Atribui o dado inserido na posição desejada
	public boolean insere(int pos, int dado);
	
	//Remove o elemento da posição inserida
	public int remove(int pos);
}

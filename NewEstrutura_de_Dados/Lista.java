
public class Lista extends No implements ListaInterface  {
	
	private No cabeca;
	private int tamanho;
	
	public Lista() {
		this.cabeca = null;
		this.tamanho = 0;
	}
@Override
public boolean verificaVazia() {
	if(this.tamanho == 0) return true; else return false;
}

@Override
public boolean verificaCheia() {
	return false;
}

@Override
public int tamanho() {
	return this.tamanho;
}
@Override
public int elementoInPos(int pos) {
	No aux = this.cabeca;
	int cont = 1;
	
	if(verificaVazia()) return -1;
	
	if(pos < 1 || pos > this.tamanho) return -1;
	
	while(cont < pos) {
		
		aux = aux.getProximo();
		cont++;
	}
	return aux.getConteudo();
}
public boolean mudaElemento(int valor, int pos) {
	No aux = this.cabeca;
	int cont = 1;
	
	if(verificaVazia()) return false;
	
	if(pos < 1 || pos > this.tamanho) return false;
	
	while(cont < pos) {
		
		aux = aux.getProximo();
		cont++;
	}

	aux.setConteudo(valor);

return true;
	
}
@Override
public int posição(int dado) {
	int cont = 1;
	No aux;
	
	if(verificaVazia()) return 0;
	
	aux = cabeca;
	while(aux != null) {
		
		if(aux.getConteudo() == dado) return cont;
		
		aux = aux.getProximo();
		cont++;
	}
	
	return -1;
	
}

private boolean insereInicioDaLista(int valor) {
	No novoNo = new No();
	
	novoNo.setConteudo(valor);
	novoNo.setProximo(this.cabeca);
	this.cabeca = novoNo;
	this.tamanho++;
	
	return true;
}
private boolean insereMeioLista(int pos, int dado) {
	int cont = 1;
	No novoNo = new No();
	novoNo.setConteudo(dado);
	
	No aux = this.cabeca;
	
	while(cont < pos-1 && aux != null) {
	
		aux = aux.getProximo();
		cont++;
		
	}
	
	if(aux == null) return false;
	
	novoNo.setProximo(aux.getProximo());
	aux.setProximo(novoNo);
	tamanho++;
	
	return true;
	
}
private boolean insereFimDaLista(int dado) {
	No novoNo = new No();
	novoNo.setConteudo(dado);
	
	No aux = this.cabeca;
	while(aux.getProximo() != null) {
		aux = aux.getProximo();
	}
	
	novoNo.setProximo(null);
	aux.setProximo(novoNo);
	this.tamanho++;
	
	return true;
}
@Override
public boolean insere(int pos, int dado) {

	if(verificaVazia() && pos != 1) return false;
	
	if(pos == 1) {
		return insereInicioDaLista(dado);
	}else if(pos == tamanho) {
		return insereFimDaLista(dado);
	}else{
		return insereMeioLista(pos, dado);
	}
	
}
private int removeInicioDaLista() {
	
	No p = this.cabeca;
	int dado = p.getConteudo();
	
	
	this.cabeca = p.getProximo();
	this.tamanho--;
	
	p = null;
	
	return dado;
}
private int removeNaLista(int pos) {
	
	No atual = null;
	No antecessor = null;
	int dado = -1;
	int cont = 1;
	
	atual = this.cabeca;
	
	while(cont < pos && atual != null) {
		
		antecessor = atual;
		atual = atual.getProximo();
		cont++;
		
	}
	
	if(atual == null) return -1;
	
	dado = atual.getConteudo();
	antecessor.setProximo(atual.getProximo());
	this.tamanho++;
	
	atual = null;
	return dado;
	
}
@Override
public int remove(int pos) {
	
	if (verificaVazia()) return -1;
	
	if(pos == 1) {
		return removeInicioDaLista();
	}else {
		return removeNaLista(pos);
	}
	
}
}
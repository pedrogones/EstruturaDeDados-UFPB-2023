

public class Pilha implements InterfacePilha {
int dados[];
private int topo;
private int tamMax;
public Pilha(){
tamMax = 4;
dados = new int[tamMax];
topo = -1;
}
/** Verifica se a Pilha está vazia */
public boolean vazia(){
if (topo == -1)
return true;
else
return false;
}
/**Verifica se a Pilha está cheia */
public boolean cheia(){
if (topo == (tamMax-1))
return true;
else
return false;
}
public int tamanho(){
return topo+1;
}
/** Retorna o elemento do topo da Pilha.
-1 se a pilha estiver vazia. */
public int top () {
if (vazia())
return -1; // pilha vazia
return dados[topo];
}
public boolean push(int valor) {
if (cheia())
return false; // err: pilha cheia
topo++;
dados[topo] = valor;
return true;
} 
public int pop() {
if (vazia())
return -1; // Pilha vazia
int valor = dados[topo];
topo--;
return valor;
}


}
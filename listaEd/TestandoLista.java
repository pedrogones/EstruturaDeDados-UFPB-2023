public class TestandoLista {
    public static void main(String[] args) {
           //criando a lista
      Lista lista = new Lista();
      //verificando se está chiea ou/e vazia
      System.out.println(lista.cheia());//ela está cheia mas nao ta vazia
      System.out.println(lista.verificaListaVazia());//els está cheia mas nao ta vazia
      System.out.println();
      //inserindo elementos na nossa lista
      lista.inserirElemento(13,  1);
      lista.inserirElemento(11,  2);
      lista.inserirElemento(132,  3);
      lista.inserirElemento(155,  4);
      System.out.println();  
      lista.exibeList();//metodo para exibir a lista
      System.out.println(); 
     //retorna o elemento contido na posição passada como parametro
      System.out.println(lista.elementInPos(1));  
      System.out.println();
      lista.retirarElemento(2);   
      lista.exibeList();
      System.out.println();
      lista.inserirElemento(34, 4);
      lista.inserirElemento(345, 5);
      lista.exibeList();
    } 
}

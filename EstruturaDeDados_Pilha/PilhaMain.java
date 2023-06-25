public class PilhaMain {
      public static void main(String[] args) {
        Pilha pilha = new Pilha();
        pilha.push(3);
        pilha.push(5);
        pilha.push(10);
        pilha.push(2);
       System.out.println("A pilha está cheia? "+  pilha.cheia());
       System.out.println("Lista pós implementações: ");
       for (int i = pilha.tamanho(); i>0; i--) {
        System.out.println(pilha.dados[i-1]);
       }
       System.out.println("Tamanho: "+pilha.tamanho());
       pilha.pop();
       pilha.pop();
       System.out.println("Lista pós remoções: ");
       for (int i = pilha.tamanho(); i >0; i--) {
        System.out.println(pilha.dados[i-1]);
       }
       System.out.println("Novo tamanho: "+ pilha.tamanho());
    }
}

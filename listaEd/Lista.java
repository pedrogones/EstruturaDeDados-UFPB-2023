
public class Lista implements Class1{
    protected int tamAtual;
    protected int tamMaximo;
    protected int lista[];
    public Lista(){
        tamAtual=5;
        tamMaximo=10;
        lista= new int[tamMaximo]; 
    }
    public void exibeList(){
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
    }
    public boolean verificaListaVazia(){
        if(tamAtual==0) 
        return true;
    else
        return false; 
    }
    public boolean cheia(){
        if(tamAtual==tamMaximo) return true;
        else return false;
    }
    public int inserirElemento(int e, int pos) {
        if(cheia()||pos>tamAtual||pos<=0){
            return -1;
        }
        for (int i=tamAtual; i<=pos; i--) {
            lista[i]=lista[i-1];
        }
        lista[pos-1]=e;
        tamAtual++;
        return lista[pos-1];
    }
    public void retirarElemento(int pos) {
        int dado;
        if(pos>tamAtual||pos<1){
            return ;
        }
        dado=lista[pos-1];
        for (int i = pos-1; i <tamAtual-1; i++) {
            lista[i]=lista[i+1];
        }
        tamAtual--;
    }
    public int elementInPos(int pos){
        if(pos<=0||verificaListaVazia()){
            return -1;
        }
        int element=-1;
        for (int i = 0; i < lista.length; i++) {
            if(pos==i+1){
               element = lista[i];
            }
        }
        return element;
    }
    @Override
    public int inserirElemento() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'inserirElemento'");
    }
    @Override
    public void retirarElemento() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'retirarElemento'");
    }
    @Override
    public int elementInPos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'elementInPos'");
    }
}
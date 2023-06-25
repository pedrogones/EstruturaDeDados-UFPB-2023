
class No{
    int informaçao;
    No esq, dir;
    int bal; // balanceamento
    
    public void creatTrees(No trees){
        trees = null;
    }
    public int empty(No trees){
        if (trees == null){
            return 0;
        }
        return 1;
    }
    public No busca(No trees, int dado){
        if(trees == null) return null;
        if(trees.informaçao == dado){
            return trees;
        }
        if(trees.informaçao > dado){
            return busca(trees.esq, dado);
        }else{
            return busca(trees.dir, dado);
        }
    } 
    void exibe(No trees){
        if(empty(trees)!=0){
            exibe(trees.esq);
            System.out.println(trees.informaçao);
            exibe(trees.dir);
        }
    }
    int insere(No trees, int item){
        No novoNo= new No(), atual= new No(), p= new No();
       if(novoNo == null) return 0;
    novoNo.informaçao = item;
    novoNo.esq = null;
    novoNo.dir = null;

    if((trees)==null){
        trees = novoNo;
    }
    atual = trees;
    while(atual != null){
        p = atual;
        if(atual.informaçao > item){
            atual = atual.esq;
        }else{
            atual = atual.dir;
        }
    }
    if(p.informaçao>item){
        p.esq = novoNo;
    } else{
        p.dir = novoNo;
    }
    return 1;
    }
    void rot_dir(No trees){
        No rotationTree;
        rotationTree = trees.esq;
        trees.esq = rotationTree.dir;
        rotationTree.dir = trees;
        trees = rotationTree;
    } 

}


 public class ArvBinaria {
        public static void main(String[] args) {
            No arvor = new No();
            arvor.insere(arvor, 14);
            arvor.insere(arvor,1);
            arvor.insere(arvor, 23);
            arvor.insere(arvor,5);
            arvor.insere(arvor, 6);
            arvor.insere(arvor,3);
            arvor.insere(arvor, 5);
            arvor.insere(arvor,4);

            arvor.exibe(arvor);
        }
}
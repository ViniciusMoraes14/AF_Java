import java.util.Scanner;

public class Armazenamento<T> {
	
	Scanner sc = new Scanner(System.in);


    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista;
    
    //Abrindo a Lista e seus Nós
    public Armazenamento(){
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }
    
    //Inserindo elementos com baixa prioridade
    public void add1(T elemento){
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(null);
        novoNo.setNoPrevio(ultimoNo);
        if(primeiroNo == null){
            primeiroNo = novoNo;
        }
        if(ultimoNo != null){
            ultimoNo.setNoProximo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    //Inserindo elementos com Alta Prioridade
    public void add0(int index, T elemento){
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(noAuxiliar);

        if(novoNo.getNoProximo() != null){
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
            novoNo.getNoProximo().setNoPrevio(novoNo);
        }else{
            novoNo.setNoPrevio(ultimoNo);
            ultimoNo = novoNo;
        }

        if(index == 0){
            primeiroNo = novoNo;
        }else{
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }
        tamanhoLista++;
    }
    
    
    //Remoção pegando a posição do slot
    public void remove(int index){
        if(index == 0){
            primeiroNo = primeiroNo.getNoProximo();
            if(primeiroNo != null){
                primeiroNo.setNoPrevio(null);
            }
        }else{
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
            if(noAuxiliar != ultimoNo){
                noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
            }else{
                ultimoNo = noAuxiliar;
            }
        }
        this.tamanhoLista--;
    }
    
    //Usando NoDuplo para percorrer a lista
    private NoDuplo<T> getNo(int index){
        NoDuplo<T> noAuxiliar = primeiroNo;
        for(int i=0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }
    //passando tamanho da lista para inteiro
    public int size(){
        return this.tamanhoLista;
    }
    
    // Formatação
    @Override
    public String toString() {
        String strRetorno = "";
        NoDuplo<T> noAuxiliar = primeiroNo;
        for(int i = 0; i<size(); i++){
            strRetorno += noAuxiliar.getConteudo() + " ";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += "";
        return strRetorno;
    }
    
}
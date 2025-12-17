import java.time.LocalDate;
import java.util.List;

public class ContaCorrente {

    Integer numero;
    Integer agencia;
    String nomeCliente;
    LocalDate dataNascimento;
    private Double saldo;
    boolean ativo;

    Double consultarSaldo (){

        return null;
    }

    List consultarExtrato (LocalDate dataInicio, LocalDate dataFim){
        return null;
    }

    void cancelar (String justificava){}
         //algoritmo irá manipular o atributo
         //ativo para que se torne false

    void transferir (ContaCorrente contaDestino, double valorTransferencia){

    }

    void sacar (double valorSolicitado){
        //não solictei logica
    }

}



package execucao;

import java.util.List;

import entidades.*;

public class FolhaDePagamento {
    public static void totalAPagar(Viagem viagem){
        System.out.println("Deverá ser pago: "+viagem.getCustoViagem());
    }
    
    public static void imprimir(List<Viagem> viagemList){
        Relatorios.imprimeViagens(viagemList);
    }
}

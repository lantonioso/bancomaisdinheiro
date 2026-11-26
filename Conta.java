package bancomaisdinheiro;
import java.math.BigDecimal;

public class Conta {
    String numeroConta ;
    String numeroAgencia; 
    BigDecimal saldo;

    public void depositar(BigDecimal valor) {
        this.saldo = this.saldo.add(valor);
    }

    public void sacar(BigDecimal valor) {
        this.saldo = this.saldo.subtract(valor);
        
    }
    
}

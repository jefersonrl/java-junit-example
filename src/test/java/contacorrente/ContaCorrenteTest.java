package contacorrente;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaCorrenteTest {
    
    @Test
    public void realizaDepositoEmContaCorrente() {
        double valorDeposito = 200.0;
        double saldoEsperado = 200.0;
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(valorDeposito);
        double saldoDaConta = cc.consultaSaldo();
        
        assertEquals(saldoEsperado, saldoDaConta, 0.0001);
    }
    
}

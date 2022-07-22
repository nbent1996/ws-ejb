package ws;

import javax.ejb.Remote;

@Remote
public interface ICalculatorWsSecurity {
    int multiplicacion(int a , int b);
}

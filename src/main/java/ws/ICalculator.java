package ws;

import javax.ejb.Remote;

@Remote
public interface ICalculator {
    int multiplicacion(int a , int b);
}

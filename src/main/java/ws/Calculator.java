package ws;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@Stateless
@WebService(serviceName="CalculatorWsSecurity")
@SOAPBinding(style=SOAPBinding.Style.RPC)
@Remote(ICalculator.class)
public class Calculator implements ICalculator {

    @WebMethod(operationName="multiplicacion")
    @Override
    public int multiplicacion(@WebParam(name="arg0")int a, @WebParam(name="arg1") int b){
        return a*b;
    }
    public static void main(String[] args){
        System.out.println("Prueba");
    }
}

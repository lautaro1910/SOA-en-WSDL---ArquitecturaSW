
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.util.List;
import modelo.AutorDAO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author lautaro
 */
@WebService(targetNamespace = "http://my.org/ns/")
public class Main {

    @WebMethod
    public List<String> devolverLibros(String autor) {
        return AutorDAO.getLibrosPorAutor(autor);
    }

    public static void main(String[] args) {
        AutorDAO.init();
        Endpoint.publish("http://localhost:8080/ws/libros", new Main());
        System.out.println("Service is published at http://localhost:8080/ws/libros?wsdl");
    }
}

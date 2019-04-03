
package server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TestWebService", targetNamespace = "http://server/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TestWebService {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://server/", className = "server.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://server/", className = "server.HelloResponse")
    @Action(input = "http://server/TestWebService/helloRequest", output = "http://server/TestWebService/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "isConnected", targetNamespace = "http://server/", className = "server.IsConnected")
    @ResponseWrapper(localName = "isConnectedResponse", targetNamespace = "http://server/", className = "server.IsConnectedResponse")
    @Action(input = "http://server/TestWebService/isConnectedRequest", output = "http://server/TestWebService/isConnectedResponse")
    public String isConnected(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param message
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sendMessage", targetNamespace = "http://server/", className = "server.SendMessage")
    @ResponseWrapper(localName = "sendMessageResponse", targetNamespace = "http://server/", className = "server.SendMessageResponse")
    @Action(input = "http://server/TestWebService/sendMessageRequest", output = "http://server/TestWebService/sendMessageResponse")
    public String sendMessage(
        @WebParam(name = "message", targetNamespace = "")
        String message);

}

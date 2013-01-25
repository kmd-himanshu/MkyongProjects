import org.apache.cxf.tools.wsdlto.WSDLToJava;

public class CodeGeneratorServer {
	public static void main(String[] args) {
		WSDLToJava.main(new String[] { "-server", "-d", "src",
				"src/TestService.wsdl" });
		System.out.println("Done!");
	}
}
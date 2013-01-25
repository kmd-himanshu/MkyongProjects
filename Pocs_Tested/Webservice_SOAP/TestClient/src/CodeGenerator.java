import org.apache.cxf.tools.wsdlto.WSDLToJava;


public class CodeGenerator {
	public static void main(String[] args) {
		WSDLToJava.main(new String[] { "-client", "-d", "src",
				"src/TestService.wsdl" });
		System.out.println("Done!");
	}
}
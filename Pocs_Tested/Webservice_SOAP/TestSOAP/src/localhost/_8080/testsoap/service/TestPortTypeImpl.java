package localhost._8080.testsoap.service;

public class TestPortTypeImpl implements TestPortType{

	@Override
	public double addOp(double in1, double in2) {
		// TODO Auto-generated method stub
		return in1+in2;
	}

	@Override
	public double multiplyOp(double part1, double part2) {
		return part1 * part2;
	}

}

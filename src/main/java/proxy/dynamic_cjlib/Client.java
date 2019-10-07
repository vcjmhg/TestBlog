package proxy.dynamic_cjlib;

import net.sf.cglib.proxy.Enhancer;

public class Client {
	public static void main(String[] args) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(LaoZong.class);
		enhancer.setCallback(new MiShu());
		
		LaoZong laozong = (LaoZong) enhancer.create();
		laozong.chifan();
		
	}
}

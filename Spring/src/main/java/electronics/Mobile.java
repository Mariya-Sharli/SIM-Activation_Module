package electronics;

import org.springframework.stereotype.Component;

@Component
public class Mobile implements Sim {
	
	
	Sim sim;//=new Airtel();
	
	
	public void setSim(Sim sim) {
		this.sim = sim;
//		sim.call();
	}
	
	public void call()
	{
		sim.call();
	}
}

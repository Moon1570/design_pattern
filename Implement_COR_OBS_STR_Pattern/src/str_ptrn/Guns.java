package str_ptrn;

import cor_ptrn.M12;
import cor_ptrn.Gun;
import cor_ptrn.NullObject;
import cor_ptrn.Service;
import cor_ptrn.Sniper;

public class Guns implements Strategy{

	@Override
	public String GolaGuliKorbe(String bondukName, int damage) {
		// TODO Auto-generated method stub
		String type = bondukName;
		
		// Entering Chain of Responsibility pattern 
		System.out.println("\n\n----------> Chain of Responsibility Pattern<---------");

		
		Gun c1 = new M12();
		Gun c2 = new Sniper();
		Gun last = (Gun) new NullObject();
		
		c1.setNext(c2);
		c2.setNext(last);
		
		Service request = new Service("Damage needed", damage);
		String result = c1.ServiceSupport(request);
		
		
		
//		String damage = bondukName+" will Damage Health 40% in one shot";
		
		System.out.println(" HERE In Guns "+ result);
		
		return result;
	}
	

}

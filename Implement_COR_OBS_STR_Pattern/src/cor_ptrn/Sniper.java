package cor_ptrn;


public class Sniper implements Gun{
	
	private Gun nextChain;

	@Override
	public void setNext(Gun nextChain) {
		// TODO Auto-generated method stub
		this.nextChain =  nextChain;
	}

	String name;
	int dmg;
	@Override
	public String ServiceSupport(Service request) {
		// TODO Auto-generated method stub
		name = request.getName();
		dmg = request.getDmg();
		
		if(dmg<=100) {
			
			System.out.println("Sniper can deal 100 damage");
			request.ShowDetails();
			System.out.println("Solution: (Sniper) = "+ dmg);
			
			return "Sniper delt "+ dmg + " damage";
		}
		
		else {
			System.out.println("Sniper Can not deal enough damage .... Going for next");
			String result = nextChain.ServiceSupport(request);
			return result;
		}
	}
		
}

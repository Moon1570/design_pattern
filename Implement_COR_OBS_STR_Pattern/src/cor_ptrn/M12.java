package cor_ptrn;



public class M12 implements Gun{
	private Gun nextChain;

	@Override
	public void setNext(Gun nextChain) {
		// TODO Auto-generated method stub
		this.nextChain =  nextChain;
	}

	String  name;
	int dmg;
	@Override
	public String ServiceSupport(Service request) {
		// TODO Auto-generated method stub
		name = request.getName();
		dmg = request.getDmg();

		if(dmg<50) {
			System.out.println("M-12 Can deal 50 damage");
			request.ShowDetails();
			System.out.println(dmg);
			System.out.println("Solution: ("+name+") = "+dmg);
			
			return "M12 delt "+ dmg + " damage";
			
		}
		else {
			System.out.println("M-12 Can not deal enough damage....Going for next Gun");
			String result = nextChain.ServiceSupport(request);
			return result;

		}
		
	}
	
}
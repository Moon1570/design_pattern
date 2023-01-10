package cor_ptrn;

public class NullObject implements Gun{
	private Gun nextChain;

	@Override
	public void setNext(Gun nextChain) {
		// TODO Auto-generated method stub
		this.nextChain =  nextChain;
	}


	@Override
	public String ServiceSupport(Service request) {
		// TODO Auto-generated method stub
		return "None Can Solve";
		
	}

}

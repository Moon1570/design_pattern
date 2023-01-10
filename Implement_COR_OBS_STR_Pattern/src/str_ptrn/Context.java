package str_ptrn;

public class Context {
	private Strategy strategy;
	private int damage;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public String executeStrategy(String bondukName, int damage) {
		return strategy.GolaGuliKorbe(bondukName, damage);
	}

}

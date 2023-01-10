package osb_ptrn;

public interface Subject {

	void subscribe(Subscriber sub);

	void unsubscribe(Observer sub);

	void notifysubscribers();

	void upload(String title);

}
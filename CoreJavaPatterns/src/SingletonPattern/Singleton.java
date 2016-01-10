package SingletonPattern;

public class Singleton {
	int i=0;

	private static Singleton singleton = new Singleton();
	private Singleton() {
	}
	public static Singleton getInstance() {
		return singleton;
	}
	public int demoMethod() {
		return ++i;
	}
}

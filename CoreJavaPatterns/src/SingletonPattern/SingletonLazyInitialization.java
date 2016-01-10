package SingletonPattern;

public class SingletonLazyInitialization {
	int i = 0;
	private static SingletonLazyInitialization obj;

	private SingletonLazyInitialization() {
	}

	public static SingletonLazyInitialization getInstance() {
		if (obj == null) {
			synchronized (SingletonLazyInitialization.class) {
				if (obj == null) {
					obj = new SingletonLazyInitialization();// instance will be
															// created at
															// request time
				}
			}
		}
		return obj;
	}

	public int demoMethod() {
		return ++i;
	}
}

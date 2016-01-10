package SingletonPattern;

public class MainClass {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.demoMethod());
		System.out.println(singleton.demoMethod());

		SingletonLazyInitialization singletonLazyInitialization = SingletonLazyInitialization
				.getInstance();
		System.out.println(singletonLazyInitialization.demoMethod());
		System.out.println(singletonLazyInitialization.demoMethod());
	}

}

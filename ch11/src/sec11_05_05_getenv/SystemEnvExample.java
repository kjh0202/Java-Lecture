package sec11_05_05_getenv;

import java.util.Map;

public class SystemEnvExample {

	public static void main(String[] args) {
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println("JAVA_HOME: " + javaHome);
		System.out.println("-------------------");
		for (Map.Entry entry: System.getenv().entrySet())
			System.out.println( entry.getKey() + "=" + entry.getValue() );

	}

}

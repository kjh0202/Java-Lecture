package sec08_07_02;

public interface ChildInterface2 extends ParentInterface  {
	@Override
	public default void method2() { }
	
	public abstract void method3();

}

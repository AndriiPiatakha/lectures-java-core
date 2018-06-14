package patterns.basicpatterns.templmethod;

public abstract class CrossCompiler {

	public final void crossCompile() {
		collectSource();
		doSmthImportant();
		// could be some general methods
		compileToTarget();
	}

	private void doSmthImportant() {
		// TODO Auto-generated method stub

	}

	protected abstract void collectSource();

	protected abstract void compileToTarget();

}
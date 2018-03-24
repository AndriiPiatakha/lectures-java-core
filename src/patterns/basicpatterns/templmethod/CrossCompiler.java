package patterns.basicpatterns.templmethod;

public abstract class CrossCompiler {

	  public final void crossCompile() {
	    collectSource();
	    // could be some general methods
	    compileToTarget();
	  }

	  protected abstract void collectSource();

	  protected abstract void compileToTarget();

	}
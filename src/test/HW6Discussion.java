package test;

import java.util.ArrayList;
import java.util.function.Function;

public class HW6Discussion {

//	public double getWeightOfPodarok(ArrayList<Confection> box){
//	       return box.stream().map(b -> b.getWeight())
//	    		   .collect(Collectors.summarizingDouble( ? :: ?  ));
//	    }

	public double getWeightOfPodarok(ArrayList<Confection> box){
	       return box.stream().filter(b -> b.getWeight() > 0)
	    		   .map(b -> b.getWeight())
	    		   .mapToDouble(b -> b)
//	    		   .mapToDouble(Double::doubleValue)
	    		   .sum();
	}
}

class Confection {

	public double getWeight() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

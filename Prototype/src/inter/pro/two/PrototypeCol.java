package inter.pro.two;

public class PrototypeCol implements PrototypeTwo {
	    private String name;
	    public PrototypeTwo clone(){
	    	PrototypeCol prototype = new PrototypeCol();
	        prototype.setName(this.name);
	        return prototype;
	    }
	    public String toString(){
	        return "Now in Prototype1 , name = " + this.name;
	    }
	    @Override
	    public String getName() {
	        return name;
	    }

	    @Override
	    public void setName(String name) {
	        this.name = name;
	    }
	}

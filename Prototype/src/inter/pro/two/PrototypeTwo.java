package inter.pro.two;
/**
 * 
 * @author zengrong
 *
 */
public interface PrototypeTwo {
		/**
		 * 具体的原型
		 * @return
		 */
		public PrototypeTwo clone();
	    public String getName();
	    public void setName(String name);
	
	
}

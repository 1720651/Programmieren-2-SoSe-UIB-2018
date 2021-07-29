package uebungen.exceptionhandling;

class HalmaException extends Exception {
	private int id;
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	public HalmaException(String msg, int id) {
		super(msg);
		this.id = id;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + ": " + this.getLocalizedMessage() + " FehlerID: " +  this.id;
	}
	
	
}

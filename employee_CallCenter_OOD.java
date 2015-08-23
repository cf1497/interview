public class CallHandler{
	private static CallHandler instance;

	private final int LEVELS = 3;
    private final int NUM_RESPONDENTS = 10;
    private final int NUM_MANAGERS = 4;
    private final int NUM_DIRECTIRS = 2;

    List<List<Employee>> employeeLevels;

    List<List<Call>> callQueues;

    protected CallHandler(){...};

    public static CallHandler getInstance(){
    	if(instance==null){
    		return new CallHandler();
    	}
    	return instance;
    }

    public Employee getHandlerForCall(Call call){

    }

    public void dispatchCall(Caller caller){
    	Call call = new Call(caller);
    	dispatchCall(call);
    }

    public void dispatchCall(Call call){
    	Employee emp = getHandlerForCall();
    	if(emp!=null){
    		emp.receiveCall(call);
    		call.setHandler(emp);
    	}else{
    		call.reply("Please wait for ....");
    		callQueues.get(call.getRanl().getValue()).add(call);
    	}
    }

    public boolean assignCall(Employee emp){...}
}



public class Call{
	private Rank rank;
	private Caller caller;
	private Employee handler;

	public Call(Caller c){
		rank = Rank.Responder;
		caller = c;
	}

	public void setHandler(Employee emp){
		handler = emp;
	}

	public void reply(){...};

	public Rank getRank(){
		return rank;
	}

	public void setRank(Rank r){
		rank = r;
	}

	public Rank incrementRank(Rank r){
		...
	}

	public void disconnect(){...};
}



abstract class Employee{
	private String name;
	private Call curCal = null;
	private Rank rank;

	public Employee(){}

	public getEmployeeName(String s){
		name = s;
	}

	public void receiveCall(Call call){

	}

	public void callCompleted(){

	}

	public void escalateAndReassign(){

	}

	public boolean assignNewCall(){

	}

	public boolean isFree(){

	}

	public Rank getRank(){
		return rank;
	}
}


class Director extends Employee{
	public Director(){
		rank = Rank.Director;
	}
}

class Manager extends Employee{
	public Manager(){
		rank = Rank.Director;
	}
}

class Respondent extends Employee{
	public Respondent(){
		rank = Rank.Respondent;
	}
}















package javay.fsm;

import java.util.List;

import javay.fsm.state.State;
import javay.fsm.transition.Transition;

public class AbstractFSM<T> implements FiniteStateMachine<T> {
	  private List<State<T>> states;
	  private State<T> initialState;
	  private List<List<Transition<T>>> transitions;
	  private State<T> currentState;

	@Override
	public List<String> getInputs() {
		String a = "s=" + null;
		System.out.println("s=" + null);
		return null;
	}

	@Override
	public void setInputs(List<String> in) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<State<T>> getStates() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setStates(List<State<T>> states) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public State<T> getInitialState() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setInitialState(State<T> initial) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Transition<T>> getTransitions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTransitions(List<Transition<T>> transition) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<State<T>> getFinalStates() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setFinalStates(List<State<T>> finalStates) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> getOutputs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setOutputs(List<String> out) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public State<T> getCurrentState() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T receive(String sin, Object params) {
		// TODO Auto-generated method stub
		return null;
	}

}

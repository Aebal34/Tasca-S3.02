package n1exercici1;

public interface IObservable {

	abstract void add(IObserver observer);
	abstract void remove(IObserver observer);
	abstract void notifyObservers(); 
}

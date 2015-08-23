/*
* Given a list of objects, returns the last object in the list that is an instance of ttpe Foo.
* @param stuff the list of objects
* @ return an boject of type Foo
* @throws NoSuchFooException if there is no Foo in the list
*/

class Problem{

	Foo getLastFoo(List stuff) throws NoSuchFooException{

		for(int i=stuff.size()-1; i>=0; i--){
			if(stuff.get(i) instanceof Foo){
				return (Foo)stuff.get(i);
			}
		}

		throw new NoSuchFooException();
	}
}
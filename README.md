# State

![image](https://github.com/user-attachments/assets/61803ac2-a3bd-4dc2-a56f-ad3d3fdca5b2)

It is a _behavioral_ design pattern that lets an object to changes its behavior when there is a change in its interal state.

 - Context
   - Maintains an instance of a concrete subclass and it defines the interface of interest to clients.
 - State
   - Defines an interface for encapsulating the behavior of associated with a particular state of the context

 - ConcreteState
   - Each subclass implements a behavior associated with a state of the context
  
## Use
- when an object behaves differently depending on its current state and the number of states is enormous.
- class polluted with massive conditional that alter how the class behaves according the the current values of fields.
- duplicate code across similar states and transitions of a condition-based state machine.

## Example
State machines/ drawing programs in which the editors behavior depends on the tool that user selected (draw shapes/circles/lines etc).


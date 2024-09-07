# Strategy

![image](https://github.com/user-attachments/assets/d4f71fa2-b5e1-4c5d-83a1-facebbb72345)

It is a _behav­ioral_ design pat­tern that lets you define a fam­i­ly of algo­rithms, 
put each of them into a sep­a­rate class, and make their objects inter­change­able.

- Strategy
  - Declares an interface common to all supported algorithms. Context uses this iterface to call the algorithm defined by a ConcreteStrategy.

- ConcreteStrategy
  - Implements the algorithm using the Strategy interface.

- Context
  - Is configured with a ConcreteStrategy object.
  - Maintains a reference to a Strategy object.

## Use

- need different variants of an algorithm within an object. In that way you can switch from one algorithm to another during runtime.
- algorithm uses data that client should not know. Isolate the business logic from the implementation details.
- class has conditional operator that switches between different variants of the same algorithm.
- a lot of similar classes that differ only in their behavior.

## Example

Navigation App. Reach to your destination by car/bicycle/train etc.

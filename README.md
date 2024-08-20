# Strategy

![image](https://github.com/user-attachments/assets/d4f71fa2-b5e1-4c5d-83a1-facebbb72345)

- Strategy
  -- Declares an interface common to all supported algorithms. Context uses this iterface to call the algorithm defined by a ConcreteStrategy.

- ConcreteStrategy
  - Implements the algorithm using the Strategy interface.

- Context
 - Is configured with a ConcreteStrategy object.
 - Maintains a reference to a Strategy object.



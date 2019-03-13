# dataflow-examples
This repository is a collection of examples of the data flow possible in Java programs.

## Graphical representations
Besides the code of each example, there are graphical representations in the form of GraphML diagrams.
To open/modify them, the [yEd Graph Editor](https://www.yworks.com/products/yed) can be used, which is also available as a [browser-based live version](https://www.yworks.com/products/yed-live). 
So no local installation is required.


## Naming conventions
- Basic examples: Minimal description of the given data flow in the form `[fromConstruct]To[toConstruct]`
- Composite examples: `Composite` + the current running index value
- Classes: Single letters starting from A
- Methods: Single letters starting from m, omitting o
- Fields/parameters/locals: Single letters starting from a

## Completeness of the minimal data flow examples
The current assumption is, that all relevant data flows originate or end in one of the following constructs:
- Fields
- Methods, or more specifically
  - Method parameters
  - Method return values

Thus, the number of minimal (i. e. containing only a single flow) data flow examples equals the number of combinations of these constructs, which is 3<sup>2</sup> = 9.

As the examples using the naming convention of basic examples (e. g. `FieldToParam`) cover all 9 cases, the set of minimal data flow examples is complete.

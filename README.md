# dataflow-examples
This repository is a collection of examples of the data flow possible in Java programs.

## Graphical representations
Besides the code of each example, there are graphical representations in the form of GraphML diagrams.
To open/modify them, the [yEd Graph Editor](https://www.yworks.com/products/yed) can be used, which is also available as a [browser-based live version](https://www.yworks.com/products/yed-live). 
So no local installation is required.
### Possible flows
The flows possible in the used graphical representation are:
- paramFlow: Denotes a flow of a parameter value to another node.
- returnFlow: Denotes a flow of a return value to another node.
- fieldFlow: Denotes a flow of a field value to another node.
- effectiveFlow: The overall flow from the first source to the last sink of a given domain, which summarizes all intermediate flows.

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

## Special data flow cases
There are a few special cases of data flow, which are neither a combination of the above mentioned constructs nor a typical composite example:
- No data flow
- Data flow of multiple parameters flowing into the same node
- Data flow of an object reference, which can be used to invoke methods

For each of the special cases, at least one example is provided along with relevant variants (e. g. an order-sensitive example of the multiple parameter flow).

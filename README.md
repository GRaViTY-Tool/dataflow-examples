# dataflow-examples
This repository is a collection of examples of the data flow possible in Java programs.

## Graphical representations and data flow models
Besides the code of each example, there are generated graphical representations in the form of dot graphs, which contain all initially inserted flows.
These flows are reduced during model creation.
The resulting full data flow models are given as .xmi files in each example's folder.
The dot graphs can be found in the 'graphs' folder of each example.

## Naming conventions
The majority of the examples use the following naming conventions:
- Basic examples: Minimal description of the given data flow in the form `[fromConstruct]To[toConstruct]`
- Composite examples: `Composite` + the current running index value
- Classes: Single letters starting from A
- Methods: Single letters starting from m, omitting o
- Fields/parameters/locals: Single letters starting from a

## Completeness of the minimal data flow examples
The underlying assumption for the minimal examples is, that all relevant data flows originate or end in one of the following constructs:
- Fields
- Methods, or more specifically
  - Method parameters
  - Method return values

Thus, the number of minimal (i. e. containing only a single flow) data flow examples equals the number of combinations of these constructs, which is 3<sup>2</sup> = 9.

As the examples using the naming convention of basic examples (e. g. `FieldToParam`) cover all 9 cases, the set of minimal data flow examples is complete under the given assumption.

## Special data flow cases
There are a few special cases of data flow, which are neither a combination of the above mentioned constructs nor a typical composite example:
- No data flow
- Data flow of multiple parameters flowing into the same node
- Data flow of an object reference, which can be used to invoke methods

For each of the special cases, at least one example is provided along with relevant variants (e. g. an order-sensitive example of the multiple parameter flow).

## GReQL-Queries
The folder 'GReQL-Queries' contains queries, which can be used with the tool GReQL of JGraLab (https://jgralab.github.io/jgralab/) to perform data flow analysis on data flow models.
To enable the analysis with GReQL, the given .xmi files need to be converted to 'TGraphs' first.
This can be done by the tool Ecore2Tg (https://github.com/jgralab/ecore2tg).
The given query examples can correctly identify the violations of the data flow examples starting with 'Violation...'.

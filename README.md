# localmarket-load-tests
Load and performace testing for Local Market application

## How to run

First of all, you need to install Local Market application. This is an application fully written with Meteor. [More info here](https://www.meteor.com/localmarket)
```bash
meteor create --example localmarket
```
Run the application:
```bash
meteor
```

Clone the project:
```bash
git clone https://github.com/rubenfreitas/localmarket-load-testing
```

Then, run the load tests:

    $mvn gatling:execute -Dgatling.simulationClass={package.name}.{ClassName}

    
## Simulations

    simulations.BasicSimulation

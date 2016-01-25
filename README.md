# localmarket-load-testing
Load testing for Local Market
=============================

##

First install Local Market application. This is an application fully written with Meteor. [More info here](https://www.meteor.com/localmarket)
```bash
    meteor create --example localmarket
```
Run the application:

```bash
meteor
```

Then, run the load tests:

    $mvn gatling:execute
    
Check out the results inside
```
target/results
```
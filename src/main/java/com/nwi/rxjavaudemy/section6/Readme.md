# Concurrency and parallelization

## Concurrency Vs Parallelization:

* In general Concurrency and Parallelization stand for the same thing ( performing multiple tasks at the same time)

* In RxJava concurrency is used to multitask when you have multiple observers

* Which means you pass emissions downstream to observers at the same time

* Parallelization means multitasking emissions themselves at the same time

* Ex: if an observable has 10 emissions they will be emitted all at the same time and we use flatMap to do so


## Starting and Stopping Scheduler and UnsubscribeOn

### Starting and Stopping schedulers

* you can manually start and stop schedulers using two methods:
 
* you can stop one scheduler by calling its method shutdown()
 
* you can stop all schedulers at once using Schedulers.shutdown()
 
* if you want to restart these schedulers again you can use start () method
 
* in normal cases you should not do that manually until you really need to do that ( EX: server side applications)
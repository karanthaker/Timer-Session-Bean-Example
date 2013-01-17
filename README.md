Timer-Session-Bean-Example
==========================

Apps that model business workflows often have to rely on timed notifications. This example is a stateless session bean that shows how to set a timer. To create a timer, one of the createTimer methods of the TimerService interface is invoked.

Concept: The timer service of the enterprise bean container enables us to schedule timed notifications for all types of enterprise beans except for stateful session beans. We can schedule a timed notification to occur at a specific time, after an amount of elapsed time, or at timed intervals. For example, we could set timers to go off at 9:30 AM on Sep 23, in 26 days, or every 3 hours. As soon as a timer expires or goes off, the EJB container calls the method annotated in the bean’s implementation class. The annotated method contains the business logic that handles the timed event.

 
TimerSessionBean is a stateless session bean that shows how to set a timer. It includes the createTimer and Timeout methods. Because its a business method, createTimer is defined separately in the TimerSession remote business interface file and can be invoked by the client.  

For example, the client could invoke createTimer with an interval of 20,000 milliseconds. The createTimer method creates a new timer by invoking the createTimer method of TimerService. A TimerService instance is injected by the container when the bean is created. Now that the timer is set, the EJB container will invoke the timeout method of TimerSessionBean when the timer expires, in about 20 seconds.

When using start() on multiple threads, they run concurrently (potentially out of order), while calling run() directly executes them sequentially in the current thread. start() creates a new thread, enabling parallel execution, while run() simply executes the code within the thread's method in the same thread that called it. 
Explanation:
start():
This method initiates a new thread of execution. The run() method within the thread's class is then executed in this new thread. The order of execution of multiple threads started with start() is not guaranteed and can vary depending on the operating system's scheduling and processor usage.
run():
Calling run() directly on a thread object executes the run() method's code within the current thread, not a new one. Therefore, the run() methods of multiple threads will be executed sequentially in the same thread, one after another. 
In essence:
start(): Enables true multi-threading, allowing tasks to run concurrently. 
run(): Executes code in the current thread, providing no concurrency benefits. 
Example (P
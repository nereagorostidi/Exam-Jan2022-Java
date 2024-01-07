# Exam-Jan2022-Java
Examen Jan2022 Java - Uso de Monitores en Threads

Examen de la asignatura "System Architecure" de 2 Grado en Ing. Tecn. de Telecomunicaciones de la uc3M

Implements in Java a program that creates 5 threads of the same class. Each thread will have an identifier and should print "Hello, I´m the thread X" being X the identifier number that has been passed as constructor.

Before finishing, each thread will have to wait until the other five have written their messages. Use a monitor as a synchronization mechanism. The use of other synchronization mechanism is not allowed. 

Example of a possible Execution:

$java Runner

Hi, I am the thread number 2
Hi, I am the thread number 3
Hi, I am the thread number 4
Hi, I am the thread number 1
Hi, I am the thread number 0

Thread 2 finished
Thread 4 finished
Thread 1 finished
Thread 3 finished
Thread 0 finished



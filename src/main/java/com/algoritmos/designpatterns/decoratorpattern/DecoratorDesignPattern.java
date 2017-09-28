/*
 * Use the decorator pattern when you have a lots of objects each with a specific behavior independent
 * of all others.
 * 
 * Each class can be constructed from an object of the common interface or base class
 * 
 * Decorator objects are usually chained(acorrentado) together, and should never know any details of the other objects
 * in the chain
 * 
 * Then have a common interface or abstract base class, and have one class for each independent type of behavior
 * 
 * You'll use Decorator pattern when a class is constantly being modified to implement new interfaces
 * O Padrão Decorator tem como característica o seguinte:

	Os decoradores têm o mesmo supertipo que os objetos que eles decoram;
		- Você pode usar um ou mais decoradores para englobar um objeto;
	    
	    - Uma vez que o decorador tem o mesmo supertipo que o objeto decorado, 
	      podemos passar um objeto decorado no lugar do objeto original (englobado);
	    
	    - O decorador adiciona seu próprio comportamento antes e/ou depois de delegar o objeto que 
	    	ele decora o resto do trabalho;
	    	
        - Os objetos podem ser decorados a qualquer momento, então podemos decorar os objetos de maneira dinâmica no tempo de execução com quantos decoradores desejarmos.
 */
package com.algoritmos.designpatterns.decoratorpattern;

public class DecoratorDesignPattern {

}

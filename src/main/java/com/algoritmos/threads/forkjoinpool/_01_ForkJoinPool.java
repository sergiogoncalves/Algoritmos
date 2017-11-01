/*
 	A funcionalidade fork/join, presente a partir do Java 7, 
 	pode ser um pouco difícil de entender a princípio, pois ela atende uma classe específica de problemas.

	Segundo a documentação da classe ForkJoinTask, 
	a ideia é permitir um método mais eficiente de processamento paralelo impondo algumas restrições sobre o modo como as threads operam.
	 
	O objetivo é conseguir dividir um problema em tarefas menores e executá-las independentemente, sem uso de sincronização (synchronized).

	Se pensarmos um pouco, isso resolve muito bem questões de Programação Dinâmica. Um dos exemplos clássicos é o número de Fibonacci.
	
	Podemos salientar os seguintes pontos:

	Estendemos RecursiveTask, uma das duas implementações disponíveis de ForkJoinTask. 
	
	Uma "tarefa recursiva" tem o propósito de executar subtarefas recursivas em paralelo e retornar um valor final.
	Dentro do método compute() ocorre a "mágica", onde definimos o limite da recursar no primeiro if e invocamos recursivamente instâncias da classe em novas threads.
	Ao invocar f1.fork(), estamos pedindo para que o cálculo de f(n-2) seja feito em outra thread. Isso libera o processamento paralelo de f(n-1).
	Finalmente, invocamos f2.compute() para calcular o valor imediatamente e f1.join() para recuperar o valor do fork ou aguardar que o processamento termine.
	Você pode executar o código acima da seguinte forma:

	ForkJoinPool pool = new ForkJoinPool(4);
	Fibonacci fibonacci = new Fibonacci(10);
	long resultado = pool.invoke(fibonacci);
	System.out.println(resultado);
	
	A class ForkJoinPool permite o gerenciamento das tarefas paralelas e o parâmetro do 
	construtor estabelece o nível de paralelismo, isto é, quantas threads serão usadas simultaneamente.
	
	O método pool.invoke(fibonacci) inicia o processamento, aguarda o cálculo e retorna o número calculado.
	
	
	Considerações finais

	A escolha entre usar threads clássicas, fork/join, 
	ThreadPoolExecutor ou qualquer outro mecanismo depende da 
	natureza do problema que você tenta resolver. 
	Uma abordagem não é necessariamente melhor que as outras para todos os tipos de problemas.

	Além disso, determinadas situações exigirão implementações mais específicas, 
	onde você vai precisar estender as classes e interfaces da API java.util.concurrent. 
	A boa notícia é que essa API é feita com isso em mente.
 */
package com.algoritmos.threads.forkjoinpool;

import java.util.concurrent.ForkJoinPool;

public class _01_ForkJoinPool {
	
	public static void main(String[] args) {
		
		ForkJoinPool pool = new ForkJoinPool(4);
		
		Fibonacci fibonacci = new Fibonacci(10);
		
		long resultado = pool.invoke(fibonacci);
		
		System.out.println(resultado);
	
	}

}

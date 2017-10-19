/*

	Allow us to decouple the sender of request from a receiver.
	
	When a request comes in from a send it's basically handled on receiver, and the another, another. Chair chain
	is like a linked list and in one pointer on of the receiver will say "I know how to handle this request" and in
	that point the chain is dominated. The sender do not need to know who in the chain is handling it.
	
	Objective:
	Avoid coupling the sender to the receiver by allowing more tha one receiving element to handle the request. 
	The sender interacts only with the first in the queue
	receiver
	
	“Evitar o acoplamento do remetente de uma solicitação ao seu receptor, 
	 ao dar a mais de um objeto a oportunidade de tratar a solicitação. 
	 Encadear os objetos receptores, passando a solicitação ao longo da cadeia até que um objeto a trate.” [1]
	 
	 https://brizeno.wordpress.com/category/padroes-de-projeto/chain-of-responsibility/
	 
	 https://pt.wikipedia.org/wiki/Chain_of_Responsibility
	 
	 

*/
package com.algoritmos.designpatterns.chainofresponsabilitypattern;

public class ChainOfResponsabilityPattern {

}

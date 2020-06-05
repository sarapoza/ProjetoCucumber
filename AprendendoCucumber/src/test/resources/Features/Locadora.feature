#language: pt

Funcionalidade: aluguel de filme com sucesso

Cenário: Deve alugar um filme com sucesso
	Dado que o filme possui estoque com 2 unidades
	E o preço de aluguel seja R$ 3
	E a data de entrega será no dia seguinte
	Quando alugar 1 unidade
	E o estoque do filme será 1 unidade
	Então o preço do aluguel será R$ 3
	
Cenário: Não deve alugar filme sem estoque
	Dado um filme com estoque de 0 unidade
	Quando alugar
	Então não será possível por falta de estoque
	E o estoque do filme será 0 unidade
	
Cenário: Deve dar condições especiais para categoria estendida
	Dado que o filme possui estoque com 2 unidades
	E o preço de aluguel seja R$ 3
	E o tipo de aluguel seja estendido
	Quando alugar 1 unidade
	Então o preço do aluguel será R$ 8
	E a data de entrega será em 3 dias
	E a pontuação recebida será de 2 pontos
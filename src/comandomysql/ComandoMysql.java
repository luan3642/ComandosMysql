
          COMO REMOVER UMA COLUNA
	  alter table  lote
	  drop column cor;
	 
	 
	  ESCOLHENDO UMA POSIÇÃO NA COLUNA, PARA SE ADICONAR
	  alter table lote
	  add column nome varchar(10) after garantia;
	 
	 
	  COLOCANDO UMA POSIÇÃO NO PRIMEIRO LUGAR DA TABELA
	  alter table lote
	  add column qualquer int first;
	  
	  
	  MODIFICANDO O TIPO DA ESTRUTURA
	  alter table lote
	  modify column entrada varchar(100);
	  
	  
	  RENOMEANDO UMA COLUNA
	  alter table lote
          change column entrada entradinha varchar(20);
	  
	  
	  RENOMEANDO O NOME DA TABELA
	  alter table lote
	  rename to JAILSON;
	  
	  APAGANDO A TABELA
	  drop table lote;*/
	    
	  APAGANDO UMA LINHA DA TABELA
          DELETE FROM NOME_TABELA WHERE NOME_CAMPO = 4;
	    
	  APAGANDO OS DADOS INTEIROS DA TABELA, MENOS A TABELA
          TRUNCATE TABLE NOME_TABELA
	  
--------------------------------------------------------------------------------------------------------------	  	  
	  

	  Conceito de banco de dados
		    
	    SQL Linguagem estruturada
		    
            DDL Data Definition Language (Linguagem de difinição de dados): 
	    - create: criação da estrutura. 
	    - alter: altera a estrutura. 
            - drop: exclui uma estrutura.

		    
	    DML Data Manipulation Language (Linguagem de manipulação de dados) 
	    -Insert: insere dados.
	    -update: altera dados. 
            -delete: exclui dados
		    
	    DQL Data Query Language (Linguagem de consulta de dados)
	    -Select: retorna dados.
            -Ordenação de dados 
            -Agrupamento de dados.
	    -Funções aritméticas. 
	    -Filtros de seleção.
		    
	    DCL Data Control Language (Linguagem de controle de dados)
	    -Grant: Habita acessa a dados e operações. 
	    -revoke: revoga acesso a dados e operações. 
		    
	    DTL Data Transaction Language (Linguagem de transação de dados):
	    -Start  transaction: incia a transação. 
	    -commit: concretiza a transação.
            -rolback: anula a transação.      
		    
		    
	


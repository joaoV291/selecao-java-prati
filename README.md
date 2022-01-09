# Selecao Java +prati
Trabalho seleção Java

Objetivo do trabalho:  Criar CRUD (Create, Read, Update, Delete) de pessoas e alunos no terminal usando apenas Java

## Funções:

- Create  - Cria uma pessoa ou aluno
- Read    - lista na tela todas as pessoas e alunos criadas
- Update  - atualiza dados de uma pessoa ou aluno
- Delete  - deleta uma pessoa ou aluno
- Encerrar programa
  
## Informações da pessoa/aluno:

- Nome;
- Telefone;
- Data de Nascimento;
- Data do Cadastro;
- Data da Última Alteração;
- Nota Final do Curso (cria um aluno se informado, senão cria uma pessoa).

## Aplicação do trabalho
  
Este projeto é executado como um menú interativo no terminal que o usuário possa usar para executar as opções apresentadas acima. O menu continua em exibição até o usuário optar encerrar a aplicação.
As informações criadas são armazenadas em ArrayLists.
A classe Aluno usa herança para aproveitar todos os dados da classe Pessoa.
Todas as informações criadas neste projeto são armazenadas em memória, não há Banco de Dados para cadastrar informações (ou seja, ao encerrar a sessão perde todo o histórico e deve-se cadastrar tudo de novo!)

Projeto feito com Eclipse IDE 2019-2, biblioteca java-11-openjdk-amd64

Status: **Essencialmente completo**, só precisa de ajustes na formatação de texto e limpeza do código

### Ajuste futuros: 

- Limpeza de texto exibido a cada comando aplicado (a la CLS);
- Pausas de informação aplicada antes de mostrar opções ("Atualizado! Pressione qualquer tecla p/ continuar...") 

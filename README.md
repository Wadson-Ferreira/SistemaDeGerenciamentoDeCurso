---

# Sistema de Gerenciamento de Cursos

Este projeto foi desenvolvido como parte dos meus estudos em Java, com o objetivo de criar um sistema simples para o gerenciamento de cursos e alunos. O sistema permite criar cursos, adicionar e remover alunos, e gerar automaticamente números de matrícula para cada aluno com base no código do curso.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada para desenvolver o sistema.
- **Coleções Java (ArrayList)**: Utilizado para gerenciar as listas de alunos em cada curso.
- **Streams API**: Utilizado para facilitar operações sobre coleções, como a filtragem de alunos.

## Funcionalidades

- **Cadastro de Cursos**: Cada curso possui um nome, uma carga horária e um código único. O código do curso é usado para gerar o número de matrícula dos alunos.
- **Cadastro de Alunos**: Alunos são cadastrados com nome e são automaticamente associados a um curso. O sistema gera um número de matrícula único para cada aluno, composto pelo código do curso e um número sequencial.
- **Gerenciamento de Alunos**: É possível adicionar e remover alunos de um curso específico.
- **Listagem de Cursos e Alunos**: O sistema permite listar todos os cursos cadastrados, bem como os alunos matriculados em cada curso.

## Como Funciona

1. **Criação do Curso**: O usuário insere o nome, a carga horária e o código do curso.
2. **Adição de Alunos**: O usuário insere o nome do aluno, e o sistema gera automaticamente o número de matrícula, combinando o código do curso e um número sequencial.
3. **Gerenciamento**: O sistema permite adicionar e remover alunos dos cursos, e listar os alunos matriculados em cada curso.

### Exemplo de Uso

Ao iniciar o sistema, o usuário pode criar um curso chamado "Java", com carga horária de 40 horas e código 100. Em seguida, o usuário pode adicionar alunos como "Wadson", "Rute" e "Cleiton". O sistema gerará automaticamente as matrículas 101, 102 e 103 para esses alunos, respectivamente.

O sistema foi desenvolvido com o apoio do ChatGPT, que auxiliou nas dúvidas em todas as etapas, desde a concepção até a resolução dos desafios. Um dos principais desafios superados foi a implementação da geração automática de matrículas, que envolveu a utilização de lógica de programação combinada com a tecnologia `Stream` do Java, a qual utilizei pela primeira vez neste projeto.

## Desafios Enfrentados

- **Geração Automática de Matrícula**: Desenvolver um sistema para gerar números de matrícula únicos, baseados no código do curso.
- **Associação entre Alunos e Cursos**: Implementar a lógica para associar corretamente alunos a cursos, garantindo a integridade dos dados.
- **Utilização do Streams API**: Foi minha primeira experiência utilizando `.stream`, o que facilitou operações sobre coleções, como filtragem e listagem de alunos.

## Conclusão

Este projeto foi uma excelente oportunidade para consolidar meus conhecimentos em Java, especialmente em áreas como manipulação de coleções e uso da API de Streams. Agradeço ao ChatGPT pela ajuda nas dúvidas diante da resolução dos problemas e desenvolvimento do código.

---

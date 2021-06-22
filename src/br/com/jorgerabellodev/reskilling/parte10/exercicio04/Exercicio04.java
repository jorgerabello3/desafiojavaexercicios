package br.com.jorgerabellodev.reskilling.parte10.exercicio04;

/**
 * Crie uma aplicação para a secretaria de uma escola, em que sejam controladas as informações sobre Alunos,
 * Disciplinas e Matrículas.
 * Antes de a escola começar a funcionar, todas as disciplinas foram cadastradas.
 * Quando o aluno chega à escola, deve ser feito um cadastro dos seus dados pessoais. Só depois, ele é,
 * anualmente, matriculado em disciplinas.
 * Os atributos das classes são:
 * Aluno (código, nome)
 * Disciplina (código, nome, carga horária geral)
 * DisciplinaPratica (carga horária prática)
 * Matricula (ano_letivo, serie, aluno, disciplina, nota1Bim, nota2Bim, nota3Bim, nota4Bim)
 * O atributo aluno na classe Matricula deve ser uma referência para a classe Aluno.
 * O atributo disciplina na classe Matricula deve ser uma referência para a classe Disciplina.
 * A DisciplinaPratica deve possuir todas as características da classe Disciplina, mais as suas especificida-
 * des (herança).
 * Essa aplicação deve fornecer meios para:
 * a) Cadastrar as disciplinas oferecidas na escola (práticas ou não).
 * b) Cadastrar alunos.
 * c) Matricular aluno em uma disciplina qualquer.
 * d) Lançar notas de um aluno.
 * e) Mostrar Boletim do aluno.
 * <p>
 * Você deverá possuir um conjunto de alunos, de disciplinas e de matrículas. Como sugestão, trabalhe
 * com, no máximo, dez alunos, cinco disciplinas e trinta matrículas (controle o preenchimento máximo).
 * Para a opção 1:
 * Cadastre uma disciplina por vez (prática ou não). O código deverá ser único.
 * Deverá existir um único vetor de disciplinas para referenciar tanto disciplinas sem prática quanto dis-
 * ciplinas práticas.
 * O usuário, durante a execução, decidirá se deseja cadastrar uma disciplina prática ou não.
 * Para a opção 2:
 * Cadastre um aluno por vez. O código deverá ser único.
 * Para a opção 3:
 * Matricule um aluno em uma disciplina (prática ou não) por vez.
 * Aluno e Matrícula já devem ter sido cadastrados.
 * Não matricule um aluno mais que uma vez, na mesma disciplina, no mesmo ano.
 * No momento da matrícula, o valor das notas deverá ser zero.
 * Para a opção 4:
 * O usuário deverá informar o código do aluno, o código da disciplina, o ano e o bimestre. Se houver
 * alguma matrícula com essas características, solicitar a digitação da nota correspondente, alterando o objeto.
 * Caso contrário, mostrar a mensagem Matrícula Inválida.
 * Para a opção 5:
 * O usuário deverá informar o código do aluno e o ano. A aplicação deverá procurar os dados corres-
 * pondentes e mostrar um relatório, conforme abaixo. Caso os dados informados não correspondam a uma
 * matrícula, mostrar a mensagem Matrícula Inválida.
 * <p>
 * Código: 1234
 * Nome: Joãozinho
 * Ano: 2011
 * <p>
 * DISCIPLINA           CH          CH PRÁTICA      1 BIM       2 BIM       3 BIM       4 BIM       MEDIA
 * INGLES               100         50                          5           7           10          7,5
 * PORTUGUÊS            140                         8           8           9           7           8
 * MATEMÁTICA           160         40              3           7           9           6           6,33
 * GEOGRAFIA            80                          8,5         9,5         6,0         7           7,75
 * <p>
 * Disciplinas práticas têm cálculo de média ponderada, em que as notas do 2 o e 4 o bimestres possuem
 * peso 2 e as demais, peso 1. Para as outras disciplinas, a média é aritmética.
 */
public class Exercicio04 {
}

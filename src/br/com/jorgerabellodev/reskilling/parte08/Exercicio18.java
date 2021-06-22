package br.com.jorgerabellodev.reskilling.parte08;

/**
 * Uma loja de eletrodomésticos está fazendo uma promoção entre seus 15 mil clientes. Todos os clientes
 * que gastarem mais de R$ 5.000,00 em compras passarão a ser considerados clientes vip, tendo 15% de
 * desconto em todas as suas compras posteriores. Esse valor é cumulativo, mas precisa atingir R$ 5.000,00
 * dentro de seis meses a partir da primeira compra ou será zerado. Faça um programa que:
 * <p>
 * a) cadastre os clientes dessa loja. Para cada cliente devem ser cadastrados: nome do cliente, CPF, RG, endereço,
 * data da primeira compra, total gasto desde sua primeira compra e um campo que diz se o cliente é vip ou
 * não. O campo que guarda o total gasto pelo cliente deve sempre iniciar com zero, e o campo em que diz se o
 * cliente é vip deve começar como FALSO;
 * b) atualize o total gasto por determinado cliente. Deve-se ler um RG e, caso este seja encontrado na lista de
 * clientes, deve-se entrar com um novo valor que atualizará o campo total gasto por esse cliente. Depois de
 * entrar com o novo total gasto, deve-se fazer um teste para verificar se o valor chegou a R$ 5.000,00. Em caso
 * positivo, o cliente passará a ser vip. Esse teste só será realizado caso o cliente ainda não seja vip;
 * c) teste se o total gasto de cada cliente não vip deve ser zerado. Se o tempo entre a data da primeira compra de
 * um cliente e a data atual exceder seis meses, o total gasto por esse cliente deverá ser zerado. Lembre-se de que
 * isso só vale para clientes não vip.
 */
public class Exercicio18 {
}

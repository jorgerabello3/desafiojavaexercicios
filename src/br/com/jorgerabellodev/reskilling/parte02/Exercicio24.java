package br.com.jorgerabellodev.reskilling.parte02;

/**
 * Faça um programa que receba o preço, a categoria (1 — limpeza; 2 — alimentação; ou 3 — vestuário)
 * e a situação (R — produtos que necessitam de refrigeração; e N — produtos que não necessitam de re-
 * frigeração).
 * Calcule e mostre:
 * ■ ■ O valor do aumento, usando as regras que se seguem.
 * <p>
 * ------------------------------------------------------------
 * PREÇO           CATEGORIA           PERCENTUAL DE AUMENTO
 * ------------------------------------------------------------
 * 1                       5%
 * <= 25               2                       8%
 * 3                       10%
 * ------------------------------------------------------------
 * 1                       12%
 * > 25                2                       15%
 * 3                       18%
 * ------------------------------------------------------------
 * <p>
 * ■ ■ O valor do imposto, usando as regras a seguir.
 * O produto que preencher pelo menos um dos seguintes requisitos pagará imposto equivalente a 5%
 * do preço; caso contrário, pagará 8%. Os requisitos são:
 * Categoria: 2
 * Situação: R
 * ■ ■ O novo preço, ou seja, o preço mais aumento menos imposto.
 * ■ ■ A classificação, usando as regras a seguir.
 * ------------------------------------------------------------
 * NOVO PREÇO                       CLASSIFICAÇÃO
 * ------------------------------------------------------------
 * <= R$ 50,00                          Barato
 * Entre R$ 50,00 e R$ 120,00           Normal
 * >= R$ 120,00                         Caro
 * ------------------------------------------------------------
 */
public class Exercicio24 {
}

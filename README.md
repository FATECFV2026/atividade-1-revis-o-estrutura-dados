# Atividade 1 - Revisão de Conceitos

## Sumário 
- [Como Utilizar Esse Projeto](#como-utilizar-esse-projeto-)
- [Escopo da Atividade](#escopo-da-atividade-%EF%B8%8F) 
  - [Exercício 01: Operações Básicas](#-exercício-01-operações-básicas)
  - [Exercício 02: Cálculo de INSS](#-exercício-02-cálculo-de-inss)
  - [Exercício 03: Cálculo de IRPF](#-exercício-03-cálculo-de-irpf)
  - [Exercício 04: Conversor de Idade](#-exercício-04-conversor-de-idade)
- [No Google ClassRoom](#no-google-clasroom--)
- [Regras](#regras-)
- [Feedback](#feedback-)
- [GitHub Classroom - Correção Automática](#github-classroom---correção-automática-)

## Como Utilizar Esse Projeto 📁

- Nesse projeto há pasta:
    - src:Exclusiva para incluir os códigos esperados

- Na sua máquina tem que ter instalado o <a href="https://www.oracle.com/br/java/technologies/downloads/" target="_blank">Java Development Kit (JDK) </a> 
- Caso utilize o VisualStudio Code é necessário que instale a <a href="https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack" target="_blank">Extension Pack for Java</a>


## Escopo da Atividade 🛠️
Implementar uma classe `App` na pasta `src` que seja capaz de resolver todos os exercícios abaixo.

**⚠️ Importante:** Cada exercício possui uma **saída esperada específica**. A correção automática irá comparar os resultados do seu programa com valores esperados, portanto:
- Os cálculos devem seguir **precisamente** as faixas e alíquotas especificadas
- Teste seus métodos com diferentes valores para garantir que os resultados estejam corretos antes de fazer o commit

---

### 🧮 Exercício 01: Operações Básicas
Escreva um programa JAVA que solicite dois números e exiba a soma, subtração, multiplicação e divisão desses números.

---

### 💸 Exercício 02: Cálculo de INSS
Escreva um programa JAVA que leia o **Nome do Funcionário** e o seu **Salário Fixo**. Através do seu salário, faça o cálculo de desconto do **INSS**:
* **7,5%** para aqueles que ganham até R$ 1.412,00
* **9%** para quem ganha entre R$ 1.412,01 até R$ 2.666,68
* **12%** para os que ganham entre R$ 2.666,69 até R$ 4.000,03
* **14%** para quem ganha de R$ 4.000,04 até R$ 7.786,02

---

### 📑 Exercício 03: Cálculo de IRPF
Escreva um programa JAVA que leia o **Nome do Funcionário** e o seu **Salário Fixo**. Através do seu salário, faça o cálculo de desconto do **IRPF**:
* **Isento** para aqueles que ganham até R$ 2.259,20
* **7,5%** para quem ganha entre R$ 2.259,21 até R$ 2.826,65
* **15%** para os que ganham entre R$ 2.826,66 até R$ 3.751,05
* **22,55%** para quem ganha de R$ 3.751,06 até R$ 4.664,68
* **27,5%** para quem ganhar mais de R$ 4.664,68

---

### 📅 Exercício 04: Conversor de Idade
Escreva um programa JAVA que leia a **Idade de um aluno em dias** e informe em anos, meses e dias.
* **Observação:** Considere que todo ano tem 365 dias (descartando anos bissextos) e todos os meses têm 30 dias.


## No Google ClassRoom  👥

- Não há necessidade fazer o upload do projeto 
- Enviar o Link do Repositório 

## Regras 📄

- Utilize as boas práticas de programação que são sempre mencionadas em aula e nos materiais; 
- Observe sempre os modificadores de acesso em atributos e métodos;
- Observe os nomes de classes e atributos;
- Utilize comentários para elucidar o cenário elaborado;

## Feedback 📨
-  Sua atividade receberá uma pontuação de 0 a 10, que compõe os 30% da Nota da ATV1;
-  A nota será atribuída no Google ClassRoom

---

## GitHub Classroom - Correção Automática 🤖

### Contrato de Métodos

Para que a correção automática funcione, implemente os métodos estáticos abaixo na classe `App`:

```java
public static double[] operacoesBasicas(double a, double b)
public static double calcularINSS(double salario)
public static double calcularIRPF(double salario)
public static int[] converterIdadeEmDias(int totalDias)
```

**Regras esperadas pelo corretor:**
- `operacoesBasicas`: deve retornar `{soma, subtracao, multiplicacao, divisao}`
- `calcularINSS`: aplica a alíquota sobre o salário inteiro, conforme faixa
- `calcularIRPF`: aplica a alíquota sobre o salário inteiro, conforme faixa
- `converterIdadeEmDias`: retorna `{anos, meses, dias}` considerando ano=365 e mês=30


Pontuação automática:
- Compilação: 2 pontos
- Exercício 01: 2 pontos
- Exercício 02: 2 pontos
- Exercício 03: 2 pontos
- Exercício 04: 2 pontos

**Total: 10 pontos**







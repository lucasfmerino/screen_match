# INTERFACES

Em Java, interfaces são uma forma de definir um contrato que as classes devem seguir, sendo que ele define quais métodos devem ser implementados pelas classes que o implementarem. Interfaces permitem que diferentes classes possam ser tratadas de maneira padronizada, via polimorfismo, tornando assim o código fácil de estender com novos comportamentos.

No Java, uma interface é definida usando a palavra-chave interface. Por exemplo:

```java
public interface Tributavel {

    double getValorImposto();

}
```

No exemplo de código anterior, estamos definindo uma interface chamada Tributavel, sendo que ela possui apenas um método chamado getValorImposto() que retorna um valor do tipo double. Essa interface pode ser implementada por qualquer classe que queira ser tributável no projeto.

Para implementar uma interface, usamos a palavra-chave implements após a definição da classe. A classe que implementa a interface deve implementar todos os métodos definidos na interface. Por exemplo:

```java
public class Produto implements Tributavel {

    private String nome;
    private double valor;

    @Override
    public double getValorImposto() {
        return this.valor * 0.1;
    }

    //getters e setters
}
```
No exemplo anterior, estamos criando uma classe chamada Produto que implementa a interface Tributavel. Essa classe implementa o método getValorImposto(), que está definido na interface Tributavel, com uma lógica de que o imposto do produto é igual a 10% do seu valor.

Também poderíamos ter uma classe de serviços, conforme abaixo:

```java
public class Servico implements Tributavel {

    private String descricao;
    private double valor;
    private double aliquotaISS;

    @Override
    public double getValorImposto() {
        return this.valor * this.aliquotaISS / 100;
    }

    //getters e setters
}
```
No exemplo acima, estamos criando uma classe chamada Servico que implementa a interface Tributavel. Essa classe implementa o método getValorImposto(), que está definido na interface Tributavel, com uma lógica de que o imposto do serviço é igual ao seu valor vezes a alíquota de ISS definida e dividido por 100. Então para um serviço de R$ 1.200,00 e alíquota de 5%, o método retornará: 1200 * 5 / 100, cujo valor do imposto fica R$ 60,00.

<br>

## Utilização de interfaces
Interfaces podem ser utilizadas para definir comportamentos que podem ser aplicados a várias classes diferentes, tornando assim o código mais modular e fácil de manter.

Por exemplo, suponha que temos um sistema de vendas que precisa calcular o imposto de diferentes tipos de produtos. Podemos criar a interface Tributavel, para definir o comportamento de calcular imposto, e criar várias classes diferentes que implementam essa interface para calcular o imposto de diferentes produtos. Por exemplo:

```java
public class CalculadoraImposto {

    private double totalImposto = 0;

    public void calcularImposto(Tributavel item) {
        this.totalImposto += item.getValorImposto();
    }

    public double getTotalImposto() {
      return this.totalImposto;
    }

}
```
Nesse exemplo, estamos criando uma classe chamada CalculadoraImposto, que tem um atributo privado chamado totalImposto, que armazena o valor total dos impostos.

Repare que o método calcularImposto recebe um parâmetro do tipo Tributavel. Ao declarar uma variável com o tipo de uma interface, como é feito nesse método, podemos atribuir a essa variável qualquer objeto que implemente essa interface, ou seja, tanto um objeto do tipo Servico quanto Produto. Para ambos os casos, a CalculadoraImposto irá chamar o método implementado na classe específica. Ou seja, para um produto, irá chamar o método getTotalImposto implementado na classe Produto. E para um serviço, irá chamar o método getTotalImposto implementado na classe Servico.

Isso é muito útil quando queremos tratar vários objetos de classes diferentes de forma semelhante, permitindo que diferentes classes possam ser tratadas de maneira padronizada, facilitando a manutenção e extensão do código. Esse é mais um exemplo de aplicação do polimorfismo em Java, mas agora com a utilização de interfaces.

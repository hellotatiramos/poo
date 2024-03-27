# ✨ Programação Orientada a Objetos - POO ✨

Conteúdo
* [O que é POO?](#o-que-é-poo)
* [Classes](#classes)
* [Enum](#enum)

*******
## O que é POO? 
>*A programação orientada a objetos (POO) é um estilo de programação que se concentra em objetos, que são como "peças" de um programa, cada um com suas próprias características e ações. Esses objetos são organizados em classes, que são como moldes que definem o que cada objeto pode fazer e como ele se parece.*

`Em resumo, a POO organiza o código em estruturas mais intuitivas e reutilizáveis, permitindo a modelagem do mundo real de forma mais fiel e facilitando a manutenção e extensão do software.`

**Exemplo: Vamos tentar representar uma Pessoa?**

Quais são os atributos que essa pessoa pode ter?
Nome, idade, gênero, etc.

Aqui está uma forma de representar isso dentro do nosso código:

```
  public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private char genero;
    
    // Construtor
    public Pessoa(String nome, int idade, char genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }
    
    // Métodos para acessar e modificar os atributos
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public char getGenero() {
        return genero;
    }
    
    public void setGenero(char genero) {
        this.genero = genero;
    }
    
    // Métodos para realizar ações
    public void caminhar() {
        System.out.println(nome + " está caminhando.");
    }
    
    public void falar(String mensagem) {
        System.out.println(nome + " diz: " + mensagem);
    }
    
    // Método principal para teste
    public static void main(String[] args) {
        // Criando uma instância de Pessoa
        Pessoa pessoa1 = new Pessoa("João", 30, 'M');
        
        // Chamando métodos para realizar ações
        pessoa1.caminhar();
        pessoa1.falar("Olá, mundo!");
    }
}
```
Neste exemplo, a classe Pessoa tem atributos para nome, idade e gênero, e métodos para acessar e modificar esses atributos, bem como métodos para realizar ações como caminhar e falar. O método main é usado para testar a classe, criando uma instância de Pessoa chamada pessoa1 e chamando alguns métodos para demonstrar as ações que uma pessoa pode realizar.

*******

## Classes

 >*Uma classe é como um modelo ou um gabarito para criar objetos. Ela define o que um objeto pode fazer (métodos) e quais informações ele pode armazenar (atributos). Pense em uma classe como um molde que pode ser usado para criar muitos objetos diferentes com características semelhantes.*

`Com uma classe eu construo quantas "pessoas" eu quiser, ou seja, quantos objetos eu quiser. Essa classe `Pessoa` poderia ter métodos como "dormir" e "falar", e atributos como "idade" e "nome". Então, quando criamos um objeto a partir dessa classe, estamos basicamente usando esse molde para criar um carro específico com suas próprias características e comportamentos.`

### O que são objetos? 

>*Um objeto é uma instância específica de uma classe. Enquanto uma classe é como um modelo que define os atributos e comportamentos dos objetos, um objeto é uma entidade concreta que é criada com base nesse modelo.*

`Por exemplo, se tivermos uma classe chamada Carro, que define atributos como "marca", "modelo" e métodos como "ligar" e "acelerar", podemos criar objetos específicos dessa classe, como um carro da marca "Toyota" e modelo "Corolla", e outro carro da marca "Honda" e modelo "Civic".`

MÉTODOS ACESSORES:
- PUBLIC: Indica que qualquer um pode acesser o elemento(a classe, os atributos e o métodos).
- PRIVATE: Indica que somente a classe consegue acessar.
- PROTECTED: Indica que somente a classe e seus filhos conseguem acessar.
- DEFAULT: Indica que somente a classe, seus filhos e as classe no mesmo package conseguem acessar.

Como boa prática em Java todos os atributos devem ser private(só a própria classe consegue acessar).

Dicionário Rápido: 
* **Classe** = Molde, Modelo, Gabarito.
* **Atributos** = Representam as características de um objeto.
* **Métodos** = Representam os comportamentos de um objeto.
* **Instância** = Uma instância é um termo usado em programação orientada a objetos para descrever um objeto específico criado a partir de uma classe. Quando você cria um objeto usando uma classe como modelo, você está instanciando essa classe. Em outras palavras, uma instância é um objeto individual que existe em memória durante a execução do programa.

*******

## Enum
Enumerações em Java, também conhecidas como enums, são uma maneira de representar um conjunto fixo de constantes em Java. Elas são usadas para definir tipos de dados que consistem em um conjunto fixo de valores pré-definidos. Uma enumeração pode ser considerada como uma classe especial em Java, onde seus membros são constantes predefinidas.

Aqui está um exemplo básico de uma enumeração em Java:

```bash
public enum DiaDaSemana {
    DOMINGO,
    SEGUNDA,
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA,
    SABADO
}
```
Neste exemplo, DiaDaSemana é uma enumeração que define os dias da semana como constantes. Cada constante é uma instância da enumeração e é definida implicitamente como um objeto dessa enumeração.

Você pode usar enums em seu código Java para representar conjuntos fixos de valores, tornando seu código mais legível e menos propenso a erros, já que o compilador pode ajudar a garantir que você esteja lidando com valores válidos para a enumeração. Além disso, você pode adicionar métodos e campos às enumerações para torná-las mais poderosas e flexíveis em sua aplicação.

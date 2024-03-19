# ✨ Programação Orientada a Objetos - POO ✨

## Definições
Um maneira simples de definir programação orientada a objetos é como sendo uma forma de simular o mundo real no desenvolvimento de software, onde os objetos são pensados como representações de coisas reais, cada um com suas características (atributos) e capacidade de realizar ações (métodos).

Objeto: Uma entidade que possui características (atributos) e comportamentos (métodos). Concretização da classe.
Classe: Um modelo ou um gabarito para criar objetos. Define os atributos e métodos que os objetos terão. Com uma única classe eu construo vários objetos.

Atributo: Uma variável que armazena dados pertencentes a um objeto.
Método: Uma função que define o comportamento dos objetos. Pode acessar e modificar os atributos do objeto.

Em resumo, a POO organiza o código em estruturas mais intuitivas e reutilizáveis, permitindo a modelagem do mundo real de forma mais fiel e facilitando a manutenção e extensão do software.

## Exemplo

Vamos tentar representar uma Pessoa?

Quais são os atributos que essa pessoa pode ter?
Nome, idade, gênero, etc.

Aqui está uma forma de representar isso dentro do nosso código:

```bash
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
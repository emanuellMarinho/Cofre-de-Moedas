# Cofrinho

O programa Cofrinho é uma aplicação simples para gerenciar um cofrinho contendo moedas de diferentes tipos (Real, Dólar e Euro). O programa permite adicionar moedas, remover moedas, listar as moedas presentes no cofrinho e calcular o valor total convertido para Real.

## Fluxo Principal

1. Configuração inicial:
    - O programa inicia definindo a localização padrão para o formato numérico (Locale.US) e cria uma instância do Scanner para leitura de entrada do usuário.
    - Também é criada uma instância da classe `MetodosCofrinho` para lidar com as operações do cofrinho.

2. Menu de opções:
    - O programa exibe um menu de opções que permite ao usuário escolher as seguintes ações:
        1. Adicionar moeda: Permite adicionar uma moeda ao cofrinho.
        2. Remover moeda: Permite remover uma moeda do cofrinho.
        3. Listar moedas: Lista todas as moedas presentes no cofrinho.
        4. Calcular total convertido para Real: Calcula o valor total das moedas convertido para Real.
        0. Encerrar: Encerra a execução do programa.

3. Loop principal:
    - O programa entra em um loop que executa até que o usuário escolha a opção de encerrar (opção 0).
    - Dentro do loop, o programa lê a opção escolhida pelo usuário e executa a ação correspondente.

## Adicionar Moeda

1. Escolha do tipo de moeda:
    - O programa exibe um submenu para o usuário escolher o tipo de moeda a ser adicionado ao cofrinho (Real, Dólar ou Euro).
    - O usuário é solicitado a digitar o número correspondente à opção desejada.
    - Se o usuário digitar um número inválido, será exibida uma mensagem de erro e o usuário terá a chance de escolher novamente.

2. Digitar valor da moeda:
    - O programa solicita ao usuário que digite o valor da moeda a ser adicionada.
    - O usuário digita o valor como um número decimal.
    - Se o usuário digitar um valor inválido (por exemplo, um texto em vez de um número), será exibida uma mensagem de erro e o usuário terá a chance de digitar novamente.

3. Criação e adição da moeda:
    - Com base na opção escolhida pelo usuário, uma instância adequada da classe `Moeda` é criada (Real, Dólar ou Euro).
    - O valor da moeda é definido com base no valor digitado pelo usuário.
    - A moeda é adicionada ao cofrinho usando o método `adicionarMoeda()` da classe `MetodosCofrinho`.

## Remover Moeda

1. Escolha do tipo de moeda:
    - O programa exibe um submenu para o usuário escolher o tipo de moeda a ser removida do cofrinho (Real, Dólar ou Euro).
    - O usuário é solicitado a digitar o número correspondente à opção desejada.
    - Se o usuário digitar um número inválido, será exibida uma mensagem de erro e o usuário terá a chance de escolher novamente.

2. Digitar valor da moeda:
    - O programa solicita ao usuário que digite o valor da moeda a ser removida.
    - O usuário digita o valor como um número decimal.
    - Se o usuário digitar um valor inválido (por exemplo, um texto em vez de um número), será exibida uma mensagem de erro e o usuário terá a chance de digitar novamente.

3. Localizar e remover a moeda:
    - Com base na opção escolhida pelo usuário, o programa itera sobre as moedas presentes no cofrinho e busca uma moeda correspondente ao tipo e valor informados pelo usuário.
    - Se a moeda for encontrada, ela é removida do cofrinho usando o método `removerMoeda()` da classe `MetodosCofrinho`.
    - Caso contrário, o programa exibe uma mensagem informando que a moeda não foi encontrada no cofrinho.

## Listar Moedas

1. Exibição das moedas presentes no cofrinho:
    - O programa utiliza o método `listarMoedas()` da classe `MetodosCofrinho` para listar todas as moedas presentes no cofrinho.
    - Para cada moeda, é exibida uma string com informações sobre o tipo de moeda e seu valor.

## Calcular Total Convertido para Real

1. Cálculo do total convertido:
    - O programa utiliza o método `convertidoReal()` da classe `MetodosCofrinho` para calcular o valor total das moedas convertido para Real.
    - O método itera sobre as moedas presentes no cofrinho, converte cada moeda para Real e acumula o valor total.
    - O valor total convertido para Real é exibido ao usuário.

## Encerrar

1. O programa exibe uma mensagem informando que a execução está sendo encerrada.

---

Este é um resumo da funcionalidade e fluxo do programa Cofrinho, explicando cada parte e o motivo por trás dela. O código foi estruturado de forma modular, utilizando classes e métodos para organizar e separar as responsabilidades.

Espero que essa documentação detalhada seja útil para entender o funcionamento do código!

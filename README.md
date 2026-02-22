# 🚀 Multiplicação de Matrizes Paralela em Java

Projeto desenvolvido para demonstrar a **multiplicação de matrizes quadradas utilizando programação concorrente com Threads em Java**.

## 📌 Descrição

O programa realiza a multiplicação de duas matrizes `N x N` geradas com valores aleatórios.  
O processamento é dividido entre múltiplas threads, onde cada uma é responsável por calcular um conjunto específico de linhas da matriz resultado.

Essa abordagem reduz o tempo de execução ao explorar paralelismo.

## ⚙️ Funcionamento

- Geração de duas matrizes (`A` e `B`)
- Divisão das linhas entre as threads
- Cálculo paralelo da matriz resultado (`C`)
- Medição do tempo total de execução

## 🧠 Conceitos Utilizados

- Threads em Java
- Interface `Runnable`
- Paralelismo por divisão de carga
- Medição de desempenho com `System.nanoTime()`

## 🎯 Objetivo

Implementar a multiplicação de matrizes utilizando threads em Java para explorar paralelismo e analisar o ganho de desempenho da execução concorrente.  

Este projeto foi desenvolvido como atividade da disciplina **Aplicações Distribuídas e Concorrentes**, com foco na prática de conceitos de programação paralela e divisão de carga de processamento.

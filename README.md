# 🎲 Components Android: Arremessador de Dados, Temporizador, Máscara de Telefone e Mais

Este projeto Android foi desenvolvido com **Jetpack Compose (Kotlin)** e contém múltiplos componentes interativos e didáticos para estudo e prática com UI declarativa.

---

## ✨ Funcionalidades

### 🎲 Arremessador de Dados
Componente que simula o arremesso de um dado de 6 faces:
- Exibe uma imagem correspondente ao número sorteado.
- Mostra o resultado numérico na tela.
- Gera um novo valor aleatório ao clicar no botão "Arremessar!".

---

### ⏱️ Temporizador
Componente de contagem regressiva:
- Inicia com tempo pré-definido (ex: 10 minutos).
- Exibe o tempo no formato `HH:MM:SS.mmm`.
- Permite **pausar e retomar** com botões interativos.
- Atualização com precisão de milissegundos.

---

### 📞 Formatador de Telefone
Campo de entrada que aplica máscara automaticamente ao número digitado:
- Formatação dinâmica em tempo real.
- Suporte aos formatos `(XX) XXXX-XXXX` e `(XX) XXXXX-XXXX`.

---

### 🔀 Navegação entre Telas
Implementação da navegação com Compose:
- `Tela1.kt`: tela inicial com botão de navegação.
- `Tela2.kt`: tela de destino.
- Navegação feita com `NavHost` e `NavController`.

---

### 📝 Componente Dinâmico com Texto
Um layout interativo com:
- Um título exibido no topo.
- Uma `TextField` para digitação.
- Um botão “OK” que, ao ser clicado, **atualiza o título** com o conteúdo digitado.

---

## 🛠 Tecnologias Utilizadas

- ✅ Kotlin
- ✅ Jetpack Compose
- ✅ Android Studio
- ✅ Gradle Kotlin DSL (`.kts`)
- ✅ Navigation Compose

---

## ▶️ Como rodar o projeto

1. Clone este repositório:

```bash
git clone https://github.com/seuusuario/seurepositorio.git
```

2. Abra o projeto no **Android Studio**.

3. Aguarde a sincronização do Gradle.

4. Execute no emulador ou dispositivo físico.

---

## 📁 Estrutura do Projeto

```
applicationDDM/
├── app/                      # Código-fonte do app
│   ├── arremessador.kt
│   ├── temporizador.kt
│   ├── formatadorTelefone.kt
│   ├── tela1.kt
│   ├── tela2.kt
│   └── componenteTexto.kt
├── gradle/                   # Configurações do Gradle
├── .gitignore
├── build.gradle.kts
├── settings.gradle.kts
├── gradlew / gradlew.bat
└── README.md
```

---

## 📌 Observações

- Projeto ideal para estudar **Jetpack Compose na prática**.
- Demonstra componentes reativos, estado com `remember`, navegação, formatação e manipulação de texto.
- `.gitignore` atualizado para ignorar arquivos desnecessários do Android Studio e do sistema de build.

---

## 🤝 Contribuições

Fique à vontade para:
- Sugerir melhorias
- Corrigir bugs

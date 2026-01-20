<!--
================================================================================
SYNC IMPACT REPORT
================================================================================
Version change: 0.0.0 → 1.0.0 (MAJOR - initial ratification)

Modified principles: N/A (initial version)

Added sections:
  - Core Principles (6 principles)
  - Technology Stack Requirements
  - Development Workflow
  - Governance

Removed sections: N/A (initial version)

Templates requiring updates:
  ✅ .specify/templates/plan-template.md - Constitution Check section compatible
  ✅ .specify/templates/spec-template.md - Requirements alignment verified
  ✅ .specify/templates/tasks-template.md - Task categorization compatible

Follow-up TODOs: None
================================================================================
-->

# Jvandior Compiler Constitution

## Core Principles

### I. Platform Independence (NON-NEGOTIABLE)

Il compilatore Jvandior DEVE essere completamente indipendente dal sistema operativo.

- Ogni componente DEVE funzionare identicamente su Windows, Linux e macOS
- È VIETATO l'uso di API o librerie specifiche del sistema operativo
- Tutti i percorsi file DEVONO utilizzare `java.nio.file.Path` con separatori normalizzati
- I test DEVONO essere eseguiti su tutte le piattaforme target prima del merge
- Le dipendenze esterne DEVONO essere verificate per la compatibilità cross-platform

**Rationale**: Un compilatore deve garantire comportamento deterministico indipendentemente
dall'ambiente di esecuzione, assicurando portabilità e riproducibilità.

### II. Standard Compliance (NON-NEGOTIABLE)

Lo sviluppo DEVE aderire rigorosamente agli standard ufficiali Java e alle best practices.

- Conformità alle Java Language Specification (JLS) e JVM Specification
- Rispetto delle Oracle Code Conventions e Google Java Style Guide
- Utilizzo esclusivo di Java JDK 25 con tutte le feature moderne appropriate
- Build system Gradle 9.1.0 con configurazione idiomatica Kotlin DSL
- Nessuna deviazione dagli standard senza documentazione esplicita e approvazione

**Rationale**: L'aderenza agli standard garantisce interoperabilità, manutenibilità
e comprensibilità del codice da parte di qualsiasi sviluppatore Java.

### III. Documentation Excellence (NON-NEGOTIABLE)

Ogni elemento del codice DEVE essere documentato con JavaDoc completo e accurato.

- Tutte le classi pubbliche DEVONO avere JavaDoc con descrizione, @author, @since
- Tutti i metodi pubblici DEVONO documentare: scopo, @param, @return, @throws
- I parametri DEVONO specificare vincoli, valori validi e comportamento con null
- Le eccezioni DEVONO descrivere condizioni di lancio e strategie di recovery
- I commenti inline DEVONO spiegare logica complessa, non ripetere il codice

**Rationale**: La documentazione esaustiva è prerequisito per manutenibilità,
collaborazione efficace e onboarding rapido di nuovi sviluppatori.

### IV. Test-First Development (NON-NEGOTIABLE)

Il codice DEVE essere sviluppato seguendo rigorosamente la metodologia TDD.

- Ciclo Red-Green-Refactor DEVE essere applicato per ogni funzionalità
- I test DEVONO essere scritti e fallire PRIMA dell'implementazione
- Copertura minima del 90% per il codice di produzione
- Nessun codice può essere considerato completo senza test corrispondenti
- Test unitari, di integrazione e contract test DEVONO coesistere appropriatamente

**Rationale**: TDD garantisce codice testabile by design, riduce i difetti e
fornisce documentazione eseguibile del comportamento atteso.

### V. Architectural Precision

L'architettura DEVE essere chiara, modulare e conforme ai principi SOLID.

- Separazione netta tra le fasi del compilatore: lexer, parser, semantic, codegen
- Ogni modulo DEVE avere responsabilità singola e interfacce ben definite
- Le dipendenze DEVONO fluire verso l'interno (Dependency Inversion)
- Pattern architetturali DEVONO essere documentati e giustificati
- Complessità ciclomatica DEVE essere minimizzata (max 10 per metodo)

**Rationale**: Un'architettura rigorosa permette evoluzione incrementale,
testing isolato e comprensione immediata della struttura del sistema.

### VI. Quality Assurance

Ogni aspetto del progetto DEVE soddisfare i più elevati standard professionali.

- Code review obbligatoria prima di ogni merge
- Analisi statica con strumenti come SpotBugs, PMD, Checkstyle
- Nessun warning del compilatore accettato nel codice finale
- Performance profiling per componenti critici (lexer, parser)
- Logging strutturato per debugging e osservabilità

**Rationale**: La qualità non è negoziabile in un compilatore dove errori
sottili possono propagarsi silenziosamente nel codice generato.

## Technology Stack Requirements

Il progetto utilizza uno stack tecnologico definito e immutabile:

- **Linguaggio**: Java JDK 25 (utilizzo di record, sealed classes, pattern matching)
- **Build System**: Gradle 9.1.0 con Kotlin DSL (`build.gradle.kts`)
- **Testing**: JUnit 5 con AssertJ per asserzioni fluide
- **Documentazione**: JavaDoc 25 con tag completi
- **Version Control**: Git con conventional commits
- **CI/CD**: Build e test automatizzati su Linux, Windows, macOS

Modifiche allo stack tecnologico richiedono emendamento costituzionale.

## Development Workflow

Il flusso di sviluppo DEVE seguire queste fasi:

1. **Specification**: Definizione requisiti in formato spec.md
2. **Planning**: Creazione plan.md con breakdown tecnico
3. **Test Writing**: Scrittura test che DEVONO fallire
4. **Implementation**: Codice minimo per far passare i test
5. **Refactoring**: Miglioramento codice mantenendo test verdi
6. **Documentation**: JavaDoc completo e aggiornamento docs
7. **Review**: Code review obbligatoria
8. **Integration**: Merge solo con CI verde su tutte le piattaforme

Checkpoint di validazione DEVONO essere rispettati tra ogni fase.

## Governance

Questa Costituzione rappresenta la legge suprema del progetto Jvandior.

- La Costituzione PREVALE su qualsiasi altra pratica o convenzione
- Ogni pull request DEVE includere verifica di conformità costituzionale
- Violazioni DEVONO essere documentate e giustificate esplicitamente
- Emendamenti richiedono: proposta documentata, periodo di review, approvazione

### Versioning Policy

- **MAJOR**: Rimozione/ridefinizione principi (breaking change governance)
- **MINOR**: Aggiunta nuovi principi o sezioni materiali
- **PATCH**: Chiarimenti, correzioni, raffinamenti non semantici

### Compliance Review

Ogni contributo DEVE essere verificato contro questa Costituzione.
Utilizzare `.specify/templates/plan-template.md` sezione "Constitution Check"
per validazione sistematica prima dell'implementazione.

**Version**: 1.0.0 | **Ratified**: 2026-01-20 | **Last Amended**: 2026-01-20
